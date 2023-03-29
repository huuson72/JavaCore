package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JDBCJoin {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Connection connection = null;
	try {
		//Tạo Kết nối
		
		  String url = "jdbc:sqlserver://localhost:4433;databaseName=JDBC;user=sa;password=123a";
	      connection = DriverManager.getConnection(url);
	      System.out.println("Succesfull");
	     
	  	//Thêm mới
	  	
	} catch (Exception e) {
		System.out.println("!Succesfull");
		e.printStackTrace();
	}	
	//in danh sach
	try {
		PreparedStatement select = connection.prepareStatement("SELECT * FROM SinhVien");
		ResultSet rs = select.executeQuery();
		while(rs.next()) {
			System.out.println("ID: "+rs.getString("ID"));
			System.out.println("Name: "+rs.getString("Name"));
			System.out.println("Dia Chia: "+rs.getString("DiaChia"));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	//Them moi
//	try {
//		PreparedStatement insert = connection.prepareStatement("INSERT INTO SinhVien(ID,Name,DiaChia) VALUES(? , ?,?)");
//		insert.setString(1,"5" );
//		insert.setString(2,"Nguyen Van Hoa" );
//		insert.setString(3, "Quang Tri");
//		insert.executeUpdate();
//		
//		
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
	//Update 
	try {
		PreparedStatement Update = connection.prepareStatement("UPDATE SinhVien SET Name= ?,DiaChia = ? WHERE ID = ?");
		Update.setString(1,"Nguyen Van Nghia" );
		Update.setString(2,"Hue" );
		Update.setString(3, "1");
		Update.executeUpdate();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	//Xoa
	try {
		PreparedStatement Delete = connection.prepareStatement("DELETE SinhVien WHERE ID = ?");
		Delete.setString(1, "1");
		Delete.executeUpdate();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	

}
}
	
