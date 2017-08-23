package org.subha.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.subha.service.CustomerService;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
		CustomerService cs =(CustomerService)ac.getBean("customerServiceProxy");
		System.out.println("***************************");
		cs.printEmail();
		System.out.println("***************************");
		cs.printName();
		System.out.println("***************************");
		cs.printThrowException();
	}

}
