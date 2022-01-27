package com.springcore.ProjectDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.ProgrammingLanguages;
import com.bean.SportsBike;
import com.bean.SportsCars;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("hello world");
        ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
//        SportsCars cars = context.getBean(SportsCars.class,"sportscars");
//        SportsBike bikes = context.getBean(SportsBike.class, "sportsbikes");
//        System.out.println(cars.getBike()+"\n"+cars);
        
        ProgrammingLanguages programmingLanguages = context.getBean(ProgrammingLanguages.class,"programminglanguages");
        System.out.println(programmingLanguages.getName()+" ->"+programmingLanguages.getFunction());
        
        
    }
}
