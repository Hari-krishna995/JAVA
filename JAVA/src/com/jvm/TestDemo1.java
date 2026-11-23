package com.jvm;

public class TestDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method Started");
		System.out.println(Class.forName("com.jvm.Welcome"));
		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("java.lang.System"));
		System.out.println("main meethod ended");
	}

}