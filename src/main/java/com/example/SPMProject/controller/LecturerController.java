package com.example.SPMProject.controller;

import com.example.SPMProject.entity.Lecturer;
import com.example.SPMProject.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lecturerapi")
public class LecturerController {

    @Autowired
    private LecturerService lecturerService;

    @PostMapping("/create")
    public void addNewAdmin(@RequestBody Lecturer lecturer){
        lecturerService.addLecturer(lecturer);
    }

}
