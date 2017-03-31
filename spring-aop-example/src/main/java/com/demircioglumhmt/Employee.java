package com.demircioglumhmt;

import org.springframework.stereotype.Component;

import com.demircioglumhmt.utils.Logger;

@Component
public class Employee implements BaseModel {

	
	private String name;
	
	
	@Logger(comments="set name in Employee",date="12/12/2016",methodName="setName(String name)")
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void throwException()
	{
		throw new RuntimeException("Array exception");
	}

	

}
