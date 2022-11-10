package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Entities.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{

	List<Course> findAll();

	Object findById(long nId);


}
