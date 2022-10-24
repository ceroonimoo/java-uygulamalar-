package Kodlama.io.business;

import java.util.logging.Logger;

import Kodlama.io.dataAcces.IInstructorDao;
import Kodlama.io.dataAcces.JdbcInstructorDao;
import Kodlama.io.entities.Instructor;

public class InstructorManager {
	private IInstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(IInstructorDao instructorDao,Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers=loggers;

	}

	public void add(Instructor instructor)  throws Exception{
		if(instructor.getFirstName()==null) {
			throw new Exception("instructor's name can not be empty");
		}
		JdbcInstructorDao instructorDao=new JdbcInstructorDao();
		
		instructorDao.add(instructor);
		for(Logger logger:loggers) {
			logger.log(null, instructor.getFirstName());
	}
}
}