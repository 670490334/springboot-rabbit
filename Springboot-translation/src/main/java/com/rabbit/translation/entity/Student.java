package com.rabbit.translation.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author 廖凡
 * @Date 2020/3/20 16:47
 */
@Data
@TableName("student")
public class Student implements Serializable {
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableId(value = "stu_name")
    private String stuName;
}
