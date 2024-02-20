package BasicLogics;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner (System.in);
		System.out.println(" enter string 1 :");
		String s1 = x.nextLine();
		System.out.println(" enter string 2 :");
		String S2=x.nextLine();
		
if (s1.compareTo(S2) <0)  
	System.out.println(" first value Smaller value than second one    ");
	else if (s1.compareTo(S2)>0) 
		System.out.println(" first value larger value than secomnd one   " );
	else 
		System.out.println("both r same");
	}


}
