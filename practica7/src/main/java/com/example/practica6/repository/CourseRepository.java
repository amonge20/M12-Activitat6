package com.example.practica6.repository;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import com.example.practica6.entitats.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{

	public List<Course>findAll();

}
