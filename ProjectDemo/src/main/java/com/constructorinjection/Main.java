package com.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 @SuppressWarnings("resource")
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/constructorinjection/constructorinjection.cfg.xml");
	People obj = context.getBean(People.class,"people");
	System.out.println(obj);
	
}
}
