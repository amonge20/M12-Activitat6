package com.example.practica6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practica6.entitats.Course;
import com.example.practica6.entitats.CourseMaterial;
import com.example.practica6.entitats.Student;
import com.example.practica6.repository.CourseRepository;

@RestController
@RequestMapping("/api")
public class controlerEntities {
	@Autowired
	CourseRepository courseRep;
	
	@Autowired
	CourseMaterial courseMaterialRep;
	
	@Autowired
	Student studentRep;
	
	@GetMapping("course")
	public List<Course> getCourses(){
		List<Course> st1List = courseRep.findAll();
		return st1List;
	}
	
	@GetMapping("course/{id}")
	public Course getCourse(@PathVariable long id) {
		Course c1 = courseRep.findById(id).get();
		return c1;
	}
	
	@GetMapping("CourseMaterial")
	public List<CourseMaterial> getcourseMaterial(){
		List<CourseMaterial> cmList = courseMaterialRep.findAll();
		return cmList;
	}
	
	@GetMapping("courseMaterial/{id}")
	public Course getcourseMaterial(@PathVariable long id) {
		Course cm1 = courseMaterialRep.findById(id).get();
		return cm1;
	}
	
	@GetMapping("student")
	public List<Student> getStudents() {
		List<Student> st1List = studentRep.findAll();
		return st1List;
	}

	// Te muestra al poner un id al final del link el alumno en concreto
	@GetMapping("student/{nId}")
	public Course getStudent(@PathVariable long nId) {
		Course st1 = studentRep.findById(nId).get();
		return st1;
	}	
}
