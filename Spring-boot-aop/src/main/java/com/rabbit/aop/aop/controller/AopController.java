package com.rabbit.aop.aop.controller;

import com.rabbit.aop.aop.config.LocalAopAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 廖凡
 * @Date 2020/3/20 16:03
 */
@RestController
public class AopController {

    @GetMapping("/aoptest")
    public String aoppointtest(String name, int point) {
        return "aoppointtest";
    }


    @LocalAopAnnotation
    @GetMapping("/annotationAopTest")
    public String annotationAopTest() {
        return "aoppointtest";
    }


}
