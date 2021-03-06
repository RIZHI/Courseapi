package io.javabrains.springbootstarter.course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository  extends CrudRepository<Course, String> {

	//Iterable<Topic> findAll();
	
	public List<Course> findByTopicId(String topic); 

	
}
