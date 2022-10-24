package Kodlama.io.dataAcces;

import Kodlama.io.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("added to database with hibernate");
	}

}
