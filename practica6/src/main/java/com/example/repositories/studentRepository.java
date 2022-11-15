package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.example.entities.*;

public interface studentRepository extends CrudRepository<student, Long> {

    public List<student> findAll();
}
