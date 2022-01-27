package com.bean.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorldMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bean/lifecycle/configlc.xml");
		context.registerShutdownHook();
		World world = context.getBean(World.class,"world");
		System.out.println(world);
	}

}
