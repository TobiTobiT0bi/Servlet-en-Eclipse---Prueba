import java.sql.*;
import java.util.List;

public class Database {
	
	{
		Connection conn = null;
	    try {
	    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "root", "");
	    	System.out.println("Conexion a DB exitosa.");
	    }
	    catch(Exception e){
	    	System.out.println("Error en la conexion a la DB: " + e.getMessage());
	    }
    }
	
	public List<Product> generateProducts(Connection conn) throws SQLException {
		List<Product> products = null;
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM products");
		
		while (rs.next()) {
			products.add(new Product(rs.getInt("id"), rs.getString("title"), rs.getString("description"),
                    rs.getDouble("price")));
		}
		
		return products;
	}
}
