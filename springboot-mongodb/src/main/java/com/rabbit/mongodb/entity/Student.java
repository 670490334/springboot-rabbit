package com.rabbit.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author 廖凡
 * @Date 2020/3/20 17:56
 */
@Data
@Document
public class Student {
    @Id
    private String id;

    private String name;
}
