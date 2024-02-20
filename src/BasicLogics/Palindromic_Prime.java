package BasicLogics;
import java.util.Scanner;

public class Palindromic_Prime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter  NUMBER : ");
        int number = sc.nextInt();
        int temp=number;
        int reversedNum = 0;
        String num=String.valueOf(number);
        boolean flag = false;
        sc.close();
        for (int i = 2; i <= number / 2; ++i)
        {
          if (number % i == 0)
          {
            flag = true;
            break;
          }
        }
       if(!flag)
    	   num='p'+num;
       while (temp != 0)
       {
           int remainder = temp % 10;
           reversedNum = reversedNum * 10 + remainder;
           temp /= 10;
       }
       if (number == reversedNum)
    	   System.out.print("Given Number is Pallindrom :  "+num);
       else
    	   System.out.print("Given Number is Not Pallindrom " );
    	  
	}

}

