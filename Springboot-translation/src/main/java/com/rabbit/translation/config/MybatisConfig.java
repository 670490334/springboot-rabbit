package com.rabbit.translation.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * @Author 廖凡
 * @Date 2020/3/20 16:40
 */
@Configuration
@EnableTransactionManagement(order = 2)
public class MybatisConfig {

}
