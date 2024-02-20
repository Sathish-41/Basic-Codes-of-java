package BasicLogics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=102;
		
		Scanner x = new Scanner (System.in);
		System.out.println("enter a number");
		int num =x.nextInt();
		int rev = 0;
		while (num !=0) {
			 rev=rev*10;
			 rev= rev+num%10;
			 num=num/10;
		}
System.out.println(rev);
	}

}
