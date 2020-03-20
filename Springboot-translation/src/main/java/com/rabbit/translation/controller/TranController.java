package com.rabbit.translation.controller;

import com.rabbit.translation.entity.Student;
import com.rabbit.translation.service.StudentService;
import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 廖凡
 * @Date 2020/3/20 17:02
 */
@AllArgsConstructor
@RestController
public class TranController {
    private StudentService studentService;

    @PostMapping("/update")
    public String updateStu(Student student) {
        studentService.updateStudent(student);
        return "ok";
    }

    @DeleteMapping("/delete")
    public String delete(Student student) {
        studentService.delete(student);
        return "ok";
    }

    @PostMapping("/insert")
    public String insert(Student student) {
        studentService.insert(student);
        return "ok";
    }
}
