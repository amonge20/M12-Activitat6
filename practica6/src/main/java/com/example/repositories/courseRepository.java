package com.example.repositories;

import com.example.repositories.*;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.entities.*;

public interface courseRepository extends CrudRepository<course, Long>{
	
	List<course>findAll();

	//Object findById(long id);
}
