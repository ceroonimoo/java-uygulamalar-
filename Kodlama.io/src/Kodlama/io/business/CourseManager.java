package Kodlama.io.business;

import java.util.logging.Logger;

import Kodlama.io.dataAcces.HibernateCourseDao;
import Kodlama.io.dataAcces.ICourseDao;
import Kodlama.io.dataAcces.JdbcCourseDao;
import Kodlama.io.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private Course[] course1;
	private Logger[] loggers;
	
	public CourseManager(ICourseDao courseDao, Course[] course1,Logger[] loggers) {
		this.courseDao = courseDao;
		this.course1 = course1;
		this.loggers=loggers;

	}

	public void add(Course course) throws Exception {
		if(course.getCoursePrice()<0) {
			throw new Exception("course's price can not be less than zero");			
		}
		for(Course course2:course1) {
			if(course2.getName()==course.getName()) {
				throw new Exception("Course names can not be the same");
			}

			JdbcCourseDao courseDao=new JdbcCourseDao();
			courseDao.add(course);
			for(Logger logger:loggers) {
				logger.log(null, course.getName());
		}
	}
}
}
