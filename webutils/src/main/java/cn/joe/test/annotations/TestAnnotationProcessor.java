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
