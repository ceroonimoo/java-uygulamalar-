package Kodlama.io.dataAcces;

import java.util.Locale.Category;

public class JdbcCategoryDao implements ICategoryDao {
	public void add(Category category) {
		System.out.println("category: "+category.name() +"added to the database with jdbc");
	}
}
