package com.example.practica6.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.practica6.entitats.CourseMaterial;

public interface CourseMaterialRepository extends CrudRepository<CourseMaterial, Long> {
	
	public List<CourseMaterial> findAll();
}
