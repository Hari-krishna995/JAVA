package com.langfundamentals;

public class Student {

	int Stdent_id;
	String Student_name;
	int Student_age;

	void hello() {
		System.out.println("Hello methos called");
	}

	public static void main(String[] args) {
		Student s1 = new Student();

		System.out.println("s1.Student_id");
		System.out.println("s1.Student_name");
		System.out.println("s1.Student_age");
		s1.hello();
	}
}
