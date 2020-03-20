package com.rabbit.mongodb.service.Impl;

import com.rabbit.mongodb.entity.Student;
import com.rabbit.mongodb.repository.StuRepository;
import com.rabbit.mongodb.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 廖凡
 * @Date 2020/3/20 18:02
 */
@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuRepository stuRepository;

    @Override
    public List<Student> getAll() {
        return stuRepository.findAll();
    }

    @Override
    public Student getbyName(String name) {

        return stuRepository.findStudentByName(name);
    }

    @Override
    public Student getById(String id) {
        return stuRepository.findStudentById(id);
    }

    @Override
    public void deleteById(String id) {
        stuRepository.deleteById(id);
    }

    @Override
    public void updateById(Student student) {
    }
}
