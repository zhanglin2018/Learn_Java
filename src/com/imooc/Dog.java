package com.imooc;

public class Dog extends Animal {
	
	public Dog() {
		super("zhanglin");
		System.out.println("Dog¿‡ ÷¥––¡À");
	}
	

	
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", subName=" + subName + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	public void eat() {
		System.out.println("age: " + age);
		System.out.println("name: " + name);
		System.out.println("subName: " + super.subName);
	}
}
