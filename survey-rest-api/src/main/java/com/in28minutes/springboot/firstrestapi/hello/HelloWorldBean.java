package com.in28minutes.springboot.firstrestapi.hello;

public class HelloWorldBean {
	
	private String massege;

	public HelloWorldBean(String massege) {
		super();
		this.massege = massege;
	}

	public String getMassege() {
		return massege;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [massege=" + massege + "]";
	}
	
	
}
