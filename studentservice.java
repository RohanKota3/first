package com.newstudentinform.newstudent.service;

import com.newstudentinform.newstudent.model.student;
import com.newstudentinform.newstudent.repositry.repositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentservice {
    @Autowired
    repositry repo;
      public student get;

    public student getstudent(String id) {
        return repo.findById(id).orElse(null);
    }


    public void addstudent(student std) {
        if(repo.existsById(std.getId())){
            return;
        }else {
            repo.save(std);
        }
    }

    public void deleteStudent(String id) {
        repo.deleteById(id);
    }

}
