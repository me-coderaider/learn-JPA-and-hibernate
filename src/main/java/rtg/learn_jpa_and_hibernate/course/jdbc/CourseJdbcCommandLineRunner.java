package rtg.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import rtg.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRespository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Learn AWS","Pankaj"));
		repository.insert(new Course(2,"Learn Azure","Pankaj"));
		repository.insert(new Course(3,"Learn GCloud","Pankaj"));
		repository.insert(new Course(4,"Learn Java","Pankaj"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(3));
	}

	

}
