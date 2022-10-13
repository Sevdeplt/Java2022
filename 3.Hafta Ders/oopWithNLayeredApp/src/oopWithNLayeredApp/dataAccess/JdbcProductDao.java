package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao { // data access object
	public void add(Product product) {
		// sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veritabanına eklendi.");
	}

}

