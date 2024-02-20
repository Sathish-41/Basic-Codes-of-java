package BasicLogics;

public class SwapVariable {
public static void main(String[] args) {
	int a=10;
	int b=3;
	System.out.println("before swap:a="  +a+" b="  +b);
	
	/*int c= a;
	a=b ;
	b=c;
	System.out.println("after swap a= "+ a+" b="   +b);
}*/
	
	// without third variable
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swap a= "+ a+" b="   +b);
	
}
}