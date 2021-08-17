package com.example.SPMProject;

import com.example.SPMProject.entity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface LecturerRepository extends MongoRepository<Lecturer, Integer> {

}
