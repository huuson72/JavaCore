package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Product {
private  int ID;
private String Name;
private double Price;
private int Quantity;
private int IdCategory;
public Product(int iD, String name, double price, int quantity, int idCategory) {
	super();
	ID = iD;
	Name = name;
	Price =  price;
	Quantity = quantity;
	IdCategory = idCategory;
}

public int getIdCategory() {
	return IdCategory;
}

public void setIdCategory(int idCategory) {
	IdCategory = idCategory;
}




public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public double getPrice() {
	return Price;
}

public void setPrice(double price) {
	Price = price;
}

public int getQuantity() {
	return Quantity;
}

public void setQuantity(int quantity) {
	Quantity = quantity;
}

public static List<Product> getProductsByCategory() throws ClassNotFoundException, SQLException{

	List<Product> products = new ArrayList<>();
	try (Connection con = Connect.getConnect()) {
		Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM Product WHERE IDCategory  ORDER BY Price DESC";
        ResultSet rs = stmt.executeQuery(sql);
       
        while (rs.next()) {
            int id = rs.getInt("ID");
            String name = rs.getString("Name");
            double price = rs.getDouble("Price");
            int quantity = rs.getInt("Quantity");
            int categoryId = rs.getInt("IDCategory");
            Product product = new Product(id, name, price, quantity, categoryId);
            products.add(product);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
	return products;
	
	
}
public boolean create() throws ClassNotFoundException, SQLException {
	Connection con = Connect.getConnect();
	String sql = String.format ("INSERT INTO Product(Name,Price,Quantity,IDCategory) VALUES('%s','%f','%d','%d')",Name,Price,Quantity,IdCategory);
	 Statement crt = con.createStatement();
	 boolean rs = crt.execute(sql); 
	 con.close();
	return rs;
}
public boolean Update() throws ClassNotFoundException, SQLException {
	Connection con = Connect.getConnect();
	String sql = String.format ("UPDATE Product SET Name = '%s' WHERE ID = '%d'",Name,ID);
	 Statement crt = con.createStatement();
	 boolean rs = crt.execute(sql); 
	 con.close();
	return rs;
}
public boolean Delete() throws ClassNotFoundException, SQLException {
	Connection con = Connect.getConnect();
	String sql = String.format ("DELETE FROM Product WHERE ID = '%d'",ID);
	 Statement dlt = con.createStatement();
	 boolean rs = dlt.execute(sql); 
	 con.close();
	return rs;
	
}
public boolean Count() throws ClassNotFoundException, SQLException {
	Connection con = Connect.getConnect();
	String sql = "SELECT Category.Name, COUNT(Product.ID) AS Count FROM Product JOIN Category ON Product.IDCategory = Category.ID GROUP BY Category.ID";
	Statement dlt = con.createStatement();
	ResultSet rs = dlt.executeQuery(sql);
    boolean result = false;
    while (rs.next()) {
        String productName = rs.getString("Name");
        int count = rs.getInt("Count");
        System.out.println("Danh muc: " + productName + " co " + count + " san pham.");
        result = true;
    }
    con.close();
    return result;
	
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Product(ID: %d, Name: %s\t Price: %.0f \tQuantity: %d\tIDCategory: %d)", ID,Name,Price,Quantity,IdCategory);
		
	}
 
}
