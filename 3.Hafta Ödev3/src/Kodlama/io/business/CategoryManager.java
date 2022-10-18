package Kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.core.logging.Logger;
import Kodlama.io.dataAccess.CategoryDao;
import Kodlama.io.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;  //bir katman başka bir katmanın classını kullanırken sadece interfaceden erişim kurmalıdır.
	private Logger[] loggers;  // List<Logger> loggers
	
public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}

private List<String> categoryNames = new ArrayList<>();



public void add(Category category) throws Exception {
	for(String categoryName :categoryNames) {
		
		if(categoryName==category.getName()) {
			throw new Exception("Bu isme ait kategori mevcuttur!");
		}
	}
	
categoryNames.add(category.getName());
categoryDao.add(category);
	
	
	for(Logger logger:loggers) {
		logger.log(category.getName());
	}
		
	}

}
