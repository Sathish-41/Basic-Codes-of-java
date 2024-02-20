package BasicLogics;

public class ReversingString {

	public static void main(String[] args) {
		
		
 String str= "sathish";
 String rev = " ";
 char []  c=str.toCharArray();
 for (int i =c.length-1; i>=0; i--) {
	 rev=rev+str.charAt(i);
	 
	 
 } 
 System.out.println(rev);
}
}
