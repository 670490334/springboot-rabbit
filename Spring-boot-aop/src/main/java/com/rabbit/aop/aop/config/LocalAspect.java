package com.rabbit.aop.aop.config;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author 廖凡
 * @Date 2020/3/20 15:48
 */
@Component
@Aspect
@Slf4j
public class LocalAspect {

    @Pointcut("execution(public * com.rabbit.aop.aop..*(..))")
    public void wepAop() {

    }

    /**
     * 使用注解切点
     *
     * @param localAopAnnotation
     */
    @SneakyThrows
    @Before("@annotation(localAopAnnotation)")
    public void doBefore(JoinPoint joinPoint, LocalAopAnnotation localAopAnnotation) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 使用pointcut
     */
    @SneakyThrows
    @Around("wepAop()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            log.info("proceed()-------begin");
            proceedingJoinPoint.proceed();
            log.info("proceed()..........end");
        } catch (Exception e) {
            log.info("错误信息：" + e.getMessage());
        }

    }

}
