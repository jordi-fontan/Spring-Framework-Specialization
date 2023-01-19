package com.dalneg.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ClassPathXmlApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx=new ClassPathXmlApplicationContext("beans.xml");
		Driver alonso = (Driver)ctx.getBean("driver");
		alonso.drive();
		alonso.drive();
		alonso.drive();
	}

}
