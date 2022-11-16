package com.example.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.course;
import com.example.entities.courseMaterial;
import com.example.entities.student;
import com.example.repositories.courseRepository;

@RestController
public class controlerEntities {
	@Autowired
	courseRepository courseRep;
	
	@Autowired
	courseMaterial courseMaterialRep;
	
	@Autowired
	student studentRep;
	
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
	
	@GetMapping("CourseMaterial")
	public List<courseMaterial> getcourseMaterial(){
		List<courseMaterial> cmList = courseMaterialRep.findAll();
		return cmList;
	}
	
	@GetMapping("courseMaterial/{id}")
	public course getcourseMaterial(@PathVariable long id) {
		course cm1 = courseMaterialRep.findById(id).get();
		return cm1;
	}
	
	@GetMapping("student")
	public List<student> getStudents() {
		List<student> st1List = studentRep.findAll();
		return st1List;
	}

	// Te muestra al poner un id al final del link el alumno en concreto
	@GetMapping("student/{nId}")
	public course getStudent(@PathVariable long nId) {
		course st1 = studentRep.findById(nId).get();
		return st1;
	}	
}
