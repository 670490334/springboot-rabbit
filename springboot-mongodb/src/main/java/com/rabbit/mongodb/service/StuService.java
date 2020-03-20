package com.rabbit.mongodb.service;

import com.rabbit.mongodb.entity.Student;

import java.util.List;

/**
 * @Author 廖凡
 * @Date 2020/3/20 18:01
 */
public interface StuService {

    List<Student> getAll();

    Student getbyName(String name);

    Student getById(String id);

    void deleteById(String id);

    void updateById(Student student);
}
