package BasicLogics;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER NUMBER OF EGGS  ");
			int noOfEggs=sc.nextInt();
			sc.close();
			int noOfGross=noOfEggs/144;
			noOfEggs=noOfEggs%144;
			int noOfDozen=noOfEggs/12;
			noOfEggs=noOfEggs%12;
			System.out.println("Your number of eggs is "+noOfGross+" gross, "+noOfDozen+" dozen, and "+noOfEggs+" eggs remaining");

		}
	}


