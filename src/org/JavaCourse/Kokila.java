package org.JavaCourse;

public class Kokila {

	static String mygirl = "Sindhu";

	public static  void Girls() {



		if (mygirl.equalsIgnoreCase("kokila")) {

			System.out.println(" She is your gf");

		} else if (mygirl.equals("Amritha")) {

			System.out.println(" she is not your gf");

		} else if (mygirl.equals("Sindhu")) {

			System.out.println(" she is your sister");

		}else {
			System.out.println("All are girls");
		}

	}



	public static void main(String[] args) {

		Kokila.Girls();

	}







}


