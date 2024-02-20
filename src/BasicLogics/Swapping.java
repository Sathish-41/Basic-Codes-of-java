package BasicLogics;
import java.util.Scanner;
public class  Swapping 
{
	 public static void main(String arg[])
		 {  
		 		  Scanner sc=new Scanner(System.in);
				  System.out.println("ENTER first element x: ");
				  int x=sc.nextInt();
				  System.out.println("ENTER second element y: ");
				  int y=sc.nextInt();
				  sc.close();

				  System.out.println("Before swapping");  
				  System.out.println("value of x:" + x);  
				  System.out.println("value of y:" + y);    
				  x = x + y;  
				  y = x - y;  
				  x = x - y;  
				  System.out.println("After swapping");
				  System.out.println("value of x:" + x);  
				  System.out.println("value of y:" + y);  
 }  
}

