package Kodlama.io;
import Kodlama.io.business.CategoryManager;

import Kodlama.io.business.CourseManager;
import Kodlama.io.business.InstructorManager;
import Kodlama.io.core.logging.DatabaseLogger;
import Kodlama.io.core.logging.FileLogger;
import Kodlama.io.core.logging.Logger;
import Kodlama.io.core.logging.MailLogger;
import Kodlama.io.dataAccess.HibernateCourseDao;
import Kodlama.io.dataAccess.JdbcCourseDao;
import Kodlama.io.dataAccess.HibernateCategoryDao;
import Kodlama.io.dataAccess.JdbcCategoryDao;
import Kodlama.io.dataAccess.HibernateInstructorDao;
import Kodlama.io.dataAccess.JdbcInstructorDao;
import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;
import Kodlama.io.entities.Instructor;


public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		Category category=new Category(1,"Programlama");
		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
		/*  Kategori ismi tekrar edemez.
		Category category1=new Category(1,"Programlama");
		CategoryManager categoryManager1=new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
		*/
			
		
		System.out.println("**********");
		
        Course course1=new Course(1,"Yazılım Geliştirici Yetiştirme Kampı-Java",250);
        CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);
        
        /*Kurs ismi tekrar edemez. ve kursun fiyatı 0'dan küçük olamaz.
        Course course2=new Course(1,"Yazılım Geliştirici Yetiştirme Kampı-Java",-1);
        CourseManager courseManager2=new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course2);
        */
        
		System.out.println("**********");
		
		Instructor instructor=new Instructor(1,"Engin ","Demiroğ");
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager.add(instructor);
		
	}

}
