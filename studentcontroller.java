package com.newstudentinform.newstudent.controller;

import com.newstudentinform.newstudent.model.student;
import com.newstudentinform.newstudent.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class studentcontroller {
    @Autowired
    studentservice stdser;

    @GetMapping("/{id}")
    public student getstudent(@PathVariable String id) {
        return stdser.getstudent(id);
    }

    @PostMapping("/")
    public void addstudent(@RequestBody student std) {
        stdser.addstudent(std);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){
        stdser.deleteStudent(id);
    }
}