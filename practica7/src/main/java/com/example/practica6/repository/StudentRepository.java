package com.example.practica6.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.example.practica6.entitats.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

    public List<Student> findAll();
}
