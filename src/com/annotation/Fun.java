package com.annotation;

class Fun{
	private int age;
	
	public Fun(int age)
	{
		this.age=age;
	}
	
	@Getter(value="CaptainAmerica")
	public int getAge()
	{
		return this.age;
		
	}
	
	@Getter(value="CaptainAmerica")
	public void deploy()
	{
		System.out.println("This is not a Getter method !!");
	}
}