package Kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.core.logging.Logger;
import Kodlama.io.dataAccess.CourseDao;
import Kodlama.io.dataAccess.HibernateCourseDao;
import Kodlama.io.dataAccess.JdbcCourseDao;
import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<String> courseNames = new ArrayList<String>();

	
	
public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers=loggers;
	}

public void add(Course course) throws Exception {
	if(course.getPrice()<0 ) {
		throw new Exception("Kursun fiyatı 0'dan küçük olamaz!");
	}
	for(String courseName : courseNames) {
		if(courseName == course.getName()) {
			throw new Exception("Bu isme ait kurs mevcuttur!");
		}
	}
	courseNames.add(course.getName());

	courseDao.add(course);

	
	for(Logger logger:loggers) {
		logger.log(course.getName());
	}
		
	}

}
