package com.rabbit.translation.service;

import com.rabbit.translation.entity.Student;

import java.util.List;

/**
 * @Author 廖凡
 * @Date 2020/3/20 16:52
 */
public interface StudentService {

    List<Student> getAllStudent();

    Student getById(String id);

    void updateStudent(Student student);

    void delete(Student student);

    void insert(Student student);

}
