package controllers;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import Entities.Course;
import repositories.CourseRepository;

@RestController
public class ControllerEntities {
	@Autowired // = new CourseRepository()
	CourseRepository courseRep;
	
	//Seleccionem l'entitat Course
	@GetMapping("course")
	public List<Course> getCouses(){
		List<Course> st1List = courseRep.findAll();
		return st1List;
	}
	
	//Seleccionem la llista de la BBDD de Courses
	@GetMapping("course/{id}")
	public Course getCourse(@PathVariable long id) {
		Course c1 = courseRep.findById(id).get();
		return c1;
	}
}

