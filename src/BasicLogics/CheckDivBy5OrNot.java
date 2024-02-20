package BasicLogics;

import java.util.Scanner;

public class CheckDivBy5OrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner  x = new Scanner(System.in);
		System.out.println("enter a number");
		int num =x.nextInt();
		
		if (num % 5 ==0) {
			System.out.println("divisable by 5");
		}else {
			System.out.println("not divisable");
		}
	}

}
