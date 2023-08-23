package com.itbaizhan.service;

import com.itbaizhan.dao.StudentDao;
import com.itbaizhan.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> findAllStudent(){
        return studentDao.findAll();
    }

    public void addStudent(Student student){
        studentDao.addStudent(student);
    }
}

