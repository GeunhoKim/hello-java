package com.geunho.hello.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HelloAspectJ {

  @Before("execution (* com.geunho.hello.aop.AspectJ.sayHello(..))")
  public void beforeSayHello(JoinPoint jp) {
    System.out.println("Before say hello " + jp);
  }
}

