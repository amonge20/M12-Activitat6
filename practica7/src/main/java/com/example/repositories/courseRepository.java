package com.example.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.entities.*;

public interface courseRepository extends CrudRepository<course, Long>{
	
	public List<course>findAll();

}
