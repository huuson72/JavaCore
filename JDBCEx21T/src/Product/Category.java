package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Category {
  private int ID;
  private String name;
public Category(int iD, String name) {
	super();
	this.ID = iD;
	this.name = name;
}
  
public Category(String string, int i, int j) {
	// TODO Auto-generated constructor stub
}

public int getID() {
	// TODO Auto-generated method stub
	return this.ID;
}

public String getName() {
	// TODO Auto-generated method stub
	return this.name;
}

public static List<Category> getSortedCategories() throws ClassNotFoundException, SQLException{
	  
	  
	Connection con = Connect.getConnect();
	PreparedStatement select = con.prepareStatement("SELECT * FROM Category ORDER BY Name ASC");
	  ResultSet rs = select.executeQuery();
	  List<Category> categories = new ArrayList<>();
	  while (rs.next()) {
          int id = rs.getInt("ID");
          String name = rs.getString("Name");
          Category category = new Category(id, name);
          categories.add(category);
      }
	  
   return categories;
 }
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Catelory: (%d, %s)", this.ID,this.name);
	}




	
}
