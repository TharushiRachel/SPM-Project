package com.example.SPMProject.service;


import com.example.SPMProject.repository.LecturerRepository;
import com.example.SPMProject.entity.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LecturerService {

    @Autowired
    private LecturerRepository lecturerRepository;

    public void addLecturer(Lecturer lecturer){
        lecturerRepository.save(lecturer);
    }

}
