package rtg.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import rtg.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS SpringData JPA", "Pankaj"));
		repository.save(new Course(2, "Learn Azure SpringData JPA", "Pankaj"));
		repository.save(new Course(3, "Learn GCloud SpringData JPA", "Pankaj"));
		repository.save(new Course(4, "Learn Java SpringData JPA", "Pankaj"));

		repository.deleteById(1l);

		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		
		System.out.println(repository.findByAuthor("Pankaj"));
		
		System.out.println(repository.findByName("Learn Java SpringData JPA"));		
		
	}

}
