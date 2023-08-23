package com.itbaizhan.dao;

import com.itbaizhan.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao
{
    @Select("select * from student")
    List<Student> findAll();

    @Insert("insert into student values(null,#{name},#{sex},#{address})")
    void addStudent(Student student);
}
