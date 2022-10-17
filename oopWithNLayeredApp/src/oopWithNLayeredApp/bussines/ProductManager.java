package oopWithNLayeredApp.bussines;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;



public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	public void add(Product product) throws Exception {
		//iş kuralları
		if(product.getUnitPrice()<10) { //3. iş birimi kuralları işletiyor uymuyorsa bagırıyor
			throw new Exception("ürünün fiyatı 10'dan küçük olamaz"); //bu metodu cagırdıgında boyle bir hata fırlatılabilir
		}
		/*HibernateProductDao yerine ProductDao yazabilirsin implements ettiğin için*/
		HibernateProductDao productDao=new HibernateProductDao(); 
		 
		productDao.add(product);//4. uyuyorsa veri tabanına ekledi
		for(Logger logger:loggers) {
			logger.log(product.getName());
		}
	}
}
