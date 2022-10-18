package Kodlama.io.dataAccess;

import Kodlama.io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}


}
