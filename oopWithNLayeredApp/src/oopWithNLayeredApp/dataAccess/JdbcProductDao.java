package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) { 
		//sadece db erişim kodları buraya yazılır->sql 
		System.out.println("JDBC ile veri tabanına eklendi"); //5. veri tabanına ekledi
	}
}
