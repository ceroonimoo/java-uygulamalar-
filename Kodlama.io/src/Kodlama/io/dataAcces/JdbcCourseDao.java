package Kodlama.io.dataAcces;

import Kodlama.io.entities.Course;

public class JdbcCourseDao implements ICourseDao {
	public void add(Course course) {
		System.out.println("course: "+course.getName() +"added to the database with jdbc");
	}
}
