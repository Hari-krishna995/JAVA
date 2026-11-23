package com.jvm;

public class TestDemo2 {

//Before running main method it will check for static method if it is there first it will execute
//loading of static Variables and Blocks is the process called Prepare
//if class not having main method java program will not execute after 1.5 version before 1.5 version static method will execute
	static {
		System.out.println("Static block called 2");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
	}

	static {
		System.out.println("Static block called 1");
	}

}