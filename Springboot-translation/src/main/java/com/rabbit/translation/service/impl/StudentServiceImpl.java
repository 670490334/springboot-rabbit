package com.rabbit.translation.service.impl;

import com.rabbit.translation.entity.Student;
import com.rabbit.translation.exception.TranException;
import com.rabbit.translation.mapper.StudentMapper;
import com.rabbit.translation.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 廖凡
 * @Date 2020/3/20 16:54
 */
@AllArgsConstructor
@Service
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student getById(String id) {
        return null;
    }

    /**
     * 默认都回滚
     *
     * @param student
     */
    @Transactional(readOnly = false)
    @Override
    public void updateStudent(Student student) {
        studentMapper.updateById(student);
        throw new RuntimeException("updateStudent");
    }

    /**
     * TranException.class 不回滚
     *
     * @param student
     */
    @Transactional(readOnly = false, noRollbackFor = TranException.class)
    @Override
    public void delete(Student student) {
        studentMapper.deleteById(student);
        throw new TranException();
    }

    @Transactional(readOnly = false)
    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }
}
