package BasicLogics;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  x = new Scanner(System.in);
		System.out.println("enter a number");
		int num =x.nextInt();
		
		if (num % 10==0) {
			System.out.println("even");
			/*if(num % 2== 1) {*/
		}else {
				System.out.println("odd");
			}
			
		}

	}


