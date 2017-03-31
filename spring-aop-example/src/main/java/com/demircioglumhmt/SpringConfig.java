package com.demircioglumhmt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.demircioglumhmt.aspect.EmployeeAfterAspect;
import com.demircioglumhmt.aspect.EmployeeAnnotationAspect;
import com.demircioglumhmt.model.Employee;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {
	
	
	@Bean
	public Employee employee()
	{
		return new Employee();
	}
	
	@Bean
	public EmployeeAfterAspect employeeAfterAspect()
	{
		return new EmployeeAfterAspect();
	}
	
	@Bean
	public EmployeeAnnotationAspect employeeAnnotationAspect()
	{
		return new EmployeeAnnotationAspect();
	}
	
	

}
