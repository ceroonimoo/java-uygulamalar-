package Kodlama.io.business;

import java.util.List;
import java.util.Locale.Category;
import java.util.logging.Logger;

import Kodlama.io.dataAcces.HibernateCategoryDao;
import Kodlama.io.dataAcces.ICategoryDao;
import Kodlama.io.dataAcces.JdbcCategoryDao;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private Category[] category1;
	private Logger[] loggers;

	public CategoryManager(ICategoryDao categoryDao, Category[] category1,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.category1 = category1;
		this.loggers=loggers;
	}
	public void add(Category category) throws Exception {
		for(Category category2:category1)
		{
			if(category2.name()==category.name())
			{
		throw new Exception("Category names can not be the same");
			}
			HibernateCategoryDao categoryDao=new HibernateCategoryDao(); 

				categoryDao.add(category);	
				for(Logger logger:loggers) {
					logger.log(null, category.name());
				}
		}
	}
}
