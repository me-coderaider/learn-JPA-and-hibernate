package rtg.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRespository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY="""
			insert into course (id, name, author)
			values(1,'Learn Spring', 'Pankaj');
			""";
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}
