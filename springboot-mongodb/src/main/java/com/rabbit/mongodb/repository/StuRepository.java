package com.rabbit.mongodb.repository;

import com.rabbit.mongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Author 廖凡
 * @Date 2020/3/20 17:58
 */

public interface StuRepository extends MongoRepository<Student,String> {

    Student findStudentByName(String name);

    Student findStudentById(String id);
}
