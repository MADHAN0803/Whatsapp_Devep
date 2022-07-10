package org.JavaCourse;

public class SwitchCase {

	String girls = "kaks";

	public void allAregirls() {

		switch (girls) {


		case "Sindhu":
			System.out.println("Sindhu is my sister");

			break;

		case "kaks":
			System.out.println("my soulmate always");
			break;


		case "harshika":
			System.out.println("my sister daughter");
			break;
			
		case "kanishka":
			System.out.println("kanishka my sister");
			break;
			
		case"Sharmi":
			System.out.println("sharmi is my sister");
			break;
			
		case"Suba":
			System.out.println("Suba is my sister");
			break;

		case"Jayapratha":
			System.out.println("Jayapratha is my sister");
			break;
			
		case "sneha":
			System.out.println("sneha is my sister");
			break;
			
		default:

			System.out.println("None is your relation");

		}


	}

	public static void main(String[] args) {

		SwitchCase case1 = new SwitchCase();
		case1.allAregirls();


	}




}
