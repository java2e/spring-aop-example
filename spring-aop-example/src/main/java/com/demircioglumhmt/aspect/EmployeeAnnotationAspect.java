package com.demircioglumhmt.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect 
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.demircioglumhmt.aspect.MyLog)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}