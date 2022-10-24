package Kodlama.io.dataAcces;

import java.util.Locale.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("added to database with hibernate");
	}

}
