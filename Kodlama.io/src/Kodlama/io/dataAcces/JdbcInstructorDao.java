package Kodlama.io.dataAcces;

import Kodlama.io.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {
	public void add(Instructor instructor) {
		System.out.println("instructor: "+instructor.firstName +instructor.lastName +"added to the database with jdbc");
	}
}
