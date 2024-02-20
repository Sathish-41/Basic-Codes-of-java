package BasicLogics;


public class PatternProgram
{
	public static void main(String[] args)
    {
             
/*	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
              System.out.print("Enter Symbol : ");
	
           char c = sc.next().charAt(0); */
 
	for(int i=3;i>0 ;i--)
               {
	        for(int j=0;j<3-i;j--)
                       {
                               System.out.print(" ");
                       }
                       for(int j=0;j<i;j++)
                
                       {
                               System.out.print("* ");
                       }
                      System.out.println();
               }                          
    }
}

