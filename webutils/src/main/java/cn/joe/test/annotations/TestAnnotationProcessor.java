package cn.joe.test.annotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 处理类
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/3/23 13:37
 * <p>
 * ------------------------------------------------------------------------
 **/
@Aspect
@Component
public class TestAnnotationProcessor {
  private static final Logger log = LoggerFactory.getLogger(TestAnnotationProcessor.class);

  @Pointcut("@annotation(cn.joe.test.annotations.TestAnnotation)")
  public void pointCut(){
  }

  /*@Around(value = "pointCut()")
  public void processor(ProceedingJoinPoint joinPoint) throws Throwable {
    log.info(joinPoint.getTarget().getClass().getName());
    log.info(joinPoint.getSignature().getName());
    joinPoint.proceed();
  }*/

  @AfterReturning(value = "pointCut()", returning = "returnValue")
  public void processor(JoinPoint joinPoint, Object returnValue) throws Throwable {
    /*log.info(joinPoint.getTarget().getClass().getName());
    log.info(joinPoint.getSignature().getName());*/
    System.out.println("返回值是：" + returnValue);
    throw new Exception("异常");
  }

}
