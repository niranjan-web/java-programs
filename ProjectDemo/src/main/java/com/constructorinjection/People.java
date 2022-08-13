package com.constructorinjection;

public class People {
private int id;
private int age;
private int pin;

public People(int id, int age, int pin) {
	super();
	this.id = id;
	this.age = age;
	this.pin = pin;
	System.out.println("integer constructor");
}

public People(String id, String age, String pin) {
	this.id = Integer.parseInt(id);
	this.age = Integer.parseInt(age);
	this.pin = Integer.parseInt(pin);
	System.out.println("string constructor");
}

public People() {
	super();
	
}

@Override
public String toString() {
	return "People [id=" + id + ", age=" + age + ", pin=" + pin + "]";
}





}
