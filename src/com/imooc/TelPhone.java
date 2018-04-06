package com.imooc;

public class TelPhone {
	double screen; 
	double cpu;
	double memory;
	
	public TelPhone() {
		screen = 13.5;
		cpu = 64.0;
		memory = 8.0;
	}
	
	void call() {
		System.out.println("com.imooc: Telphone call() \n");
	}
	
	void sendMessage() {
		System.out.println("com.imooc: screen: " + screen + "\n");
		System.out.println("com.imooc: cpu: " + cpu + "\n");
		System.out.println("com.imooc: memory: " + memory + "\n");
	}

}











