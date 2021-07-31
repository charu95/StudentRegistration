package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  StudentRepository extends MongoRepository<Student,Integer> {
}
