package Kodlama.io;

import java.util.logging.Logger;

import Kodlama.io.business.CategoryManager;
import Kodlama.io.business.CourseManager;
import Kodlama.io.business.InstructorManager;
import Kodlama.io.core.logging.DatabaseLogger;
import Kodlama.io.core.logging.FileLogger;
import Kodlama.io.dataAcces.HibernateCategoryDao;
import Kodlama.io.dataAcces.HibernateCourseDao;
import Kodlama.io.dataAcces.JdbcCategoryDao;
import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;
import Kodlama.io.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Category category=new Category(1,"programlama");
		Course course=new Course(1,"yazılım geliştirici yetiştirme kampı-java","java kursu","Engin Demiroğ",55.5);	
		Instructor instructor=new Instructor(1,"Engin","Demiroğ");
		
		Logger[] loggers= {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category);
		
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course);
		
		InstructorManager instructorManager=new InstructorManager(new JdbcCourseDao(),loggers);
		instructorManager.add(instructor);


		
	}

}
