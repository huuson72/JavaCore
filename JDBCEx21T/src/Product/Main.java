package Product;

import java.sql.SQLException;
import java.util.List;

public class Main {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
		
	
	 List<Category> categories = Category.getSortedCategories();
	 for (Category category : categories) {
         System.out.println(category.toString());
     }
//	 Product pro = new Product(0, "May Tinh", 500000, 20,2);
//	 Product pro1 = new Product(5, "Ipad", 500000, 20,2);
//	 pro1.Update();
	    List<Product> products = Product.getProductsByCategory(); 
//	    Product pro2 = new Product(1, "Ipad", 15000, 100,1);
//	    pro2.Delete();
	    Product cnt = new Product(3, "Ipad", 300000, 1000, 3);
	    cnt.Delete();
	    
	    for (Product product : products) {
//	    	 System.out.println("Name: " + product.getName() + "\t" +"Price: "+ product.getPrice()+ "\t" +"Quantity: " +product.getQuantity());
            System.out.println(product.toString()); 
            
	    }
	   
	    boolean result = cnt.Count();
	    
	} catch (Exception e) {
		System.out.print("Error"+e.getMessage());
	}
	
	 
}
}
