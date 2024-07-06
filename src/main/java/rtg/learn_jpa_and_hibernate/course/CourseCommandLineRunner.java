package rtg.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import rtg.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Learn AWS JPA","Pankaj"));
		repository.insert(new Course(2,"Learn Azure JPA","Pankaj"));
		repository.insert(new Course(3,"Learn GCloud JPA","Pankaj"));
		repository.insert(new Course(4,"Learn Java JPA","Pankaj"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(3));
	}

	

}
