package BasicLogics;

import java.util.Scanner;

public class ChexkIsalphabetOrDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  x = new Scanner(System.in);
		System.out.println("enter a number");
		String S=x.next();
		for (int  i=0 ; i<=S.length(); i++ ) {
		char  c =S.charAt(i);
		x.close();
		
		if (Character.isDigit(c) && Character.isAlphabetic(c)) {
			System.out.println("charcter and digiy present");
		}else {
			System.out.println("not present in input");
		}
		}}}