package com.example.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.course;
import com.example.repositories.courseRepository;

@RestController
public class controlerEntities {
	@Autowired
	courseRepository courseRep;
	
	@GetMapping("course")
	public List<course> getCourses(){
		List<course> st1List = courseRep.findAll();
		return st1List;
	}
	
	@GetMapping("course/{id}")
	public course getCourse(@PathVariable long id) {
		course c1 = courseRep.findById(id).get();
		return c1;
	}
}
