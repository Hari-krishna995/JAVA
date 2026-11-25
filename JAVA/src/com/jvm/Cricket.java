package com.jvm;

public class Cricket {

	// Declaration of static variables

	static int Country_id;
	static String Country_Name;

	// Declaration of instance variables or non static variables

	int Jersey_id;
	String Player_name;

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team");

		Country_id = 91;
		Country_Name = "India";

		System.out.println("-----OBJ - 1-----");

		// Access of static variables

		System.out.println("Country ID : " + Country_id);
		System.out.println("Country Name : " + Country_Name);

		// Access the instance variables
		// Access the instance area to static area is not possible if we try we will get compile time error
		// if we want to access instance data to static data we should create an object

		// LHS=RHS
		// LHS = "Cricket" is class name and msd is an object reference variable.
		// RHS = new is the keyword in java to create object and Cricket() is Constructor calling

		Cricket msd = new Cricket();// Creating Object Class

		msd.Jersey_id = 7;
		msd.Player_name = "Mahendra Singh Dhoni";

		System.out.println("Jersey ID : " + msd.Jersey_id);
		System.out.println("Player Name : " + msd.Player_name);

		System.out.println("---- OBJ 2----");

		Cricket virat = new Cricket();

		virat.Jersey_id = 18;
		virat.Player_name = "Virat Kholi";

		System.out.println("Country ID : " + Country_id);
		System.out.println("Country Name : " + Country_Name);
		System.out.println("Jersey ID : " + virat.Jersey_id);
		System.out.println("Player Name : " + virat.Player_name);
		
		System.out.println("---- OBJ 3----");

		Cricket rohit = new Cricket();

		rohit.Jersey_id = 45;
		rohit.Player_name = "Rohit Sharma";

		System.out.println("Country ID : " + Country_id);
		System.out.println("Country Name : " + Country_Name);
		System.out.println("Jersey ID : " + rohit.Jersey_id);
		System.out.println("Player Name : " + rohit.Player_name);
		
		System.out.println("---- OBJ 4----");
		
		Country_id=92;
		Country_Name="Bharath";

		Cricket vib = new Cricket();

		vib.Jersey_id = 3;
		vib.Player_name = "Vaibhav Surya Vanshi";

		System.out.println("Country ID : " + Country_id);
		System.out.println("Country Name : " + Country_Name);
		System.out.println("Jersey ID : " + vib.Jersey_id);
		System.out.println("Player Name : " + vib.Player_name);

	}

}
