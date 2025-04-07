package com.wish.shopping.utils;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;
import java.awt.event.WindowFocusListener;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {


//    @Around("@annotation(EmailLogging)")
//    public Object EmailLogging(ProceedingJoinPoint joinPoint) throws Throwable {
//        long statTime = System.currentTimeMillis();
//
//        Object proceed = joinPoint.proceed(); // 실제 메소드 실행
//
//        long endTime = System.currentTimeMillis();
//
//        log.info("{} 메소드 실행 시간 : {}ms", joinPoint.getSignature().getName(), (endTime - statTime));
//        return proceed;
//    }
//
//    @After("@annotation(EmailLogging)")
//    public void afterEmailLogging(ProceedingJoinPoint joinPoint) {
//        log.info("After advice executed for method: {}", joinPoint.getSignature().getName());
//    }

    @AfterReturning(pointcut ="@annotation(EmailLogging)", returning = "result")
    public void EmailLogging(JoinPoint joinPoint, Object result){
        String methodN = joinPoint.getSignature().getName();
        log.info("{} 메소드 실행 결과 : {}", methodN, result);
    }


}
