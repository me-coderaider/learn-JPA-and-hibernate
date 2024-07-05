package rtg.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import rtg.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRespository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY="""
			insert into course (id, name, author)
			values(?,?,?);
			""";
	
	private static String DELETE_QUERY="""
				delete from course where id = ? 
			""";
	
	private static String SELECT_QUERY="""
				select * from course where id =?
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(long id) {
		// RESULT set map it to a Bean, and those components are called RowMappers
		// Id as input
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
	}
}
