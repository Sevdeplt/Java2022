package Kodlama.io.dataAccess;

import Kodlama.io.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
