package oopWithNLayeredApp;

import oopWithNLayeredApp.bussines.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1=new Product(1,"iphone XR",9000); //1. ekrana urun girdik
		
		Logger[] loggers= {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers); //2. iş birimine yolladık
		productManager.add(product1);
	}

}
