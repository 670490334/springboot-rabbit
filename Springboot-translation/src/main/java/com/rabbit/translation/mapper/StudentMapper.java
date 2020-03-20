package com.rabbit.translation.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rabbit.translation.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 廖凡
 * @Date 2020/3/20 16:52
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
