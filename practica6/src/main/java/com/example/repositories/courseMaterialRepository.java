package com.example.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.entities.*;

public interface courseMaterialRepository extends CrudRepository<courseMaterial, Long> {
	
	List<courseMaterial> findAll();
}
