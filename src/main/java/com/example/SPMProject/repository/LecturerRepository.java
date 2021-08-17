package com.example.SPMProject.repository;

import com.example.SPMProject.entity.Lecturer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LecturerRepository extends MongoRepository<Lecturer, Integer> {

}
