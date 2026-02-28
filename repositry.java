package com.newstudentinform.newstudent.repositry;

import com.newstudentinform.newstudent.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositry extends JpaRepository<student,String> {
}
