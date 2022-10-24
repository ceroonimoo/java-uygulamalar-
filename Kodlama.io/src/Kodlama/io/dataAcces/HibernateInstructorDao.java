package Kodlama.io.dataAcces;

import Kodlama.io.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("added to database with hibernate");		
	}

}
