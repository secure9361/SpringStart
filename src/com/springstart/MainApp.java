package com.springstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring hs = (HelloSpring) context.getBean("helloSpring");
		
		String msg = hs.getMessage();
		System.out.println("Message is " + msg);
	}

}
