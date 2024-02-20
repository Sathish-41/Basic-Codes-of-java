package BasicLogics;

public class Traingle {

	public static void main(String[] args) {
		
		// traingle logic
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int s=1 ;s<=n; s++) {
				System.out.print(" ");
			}
				for (int j=1 ; j<=i*2-1; j++) {
					System.out.print("*");
				}
			
		
System.out.println();
		}
		// reverse logic traingfle
for(int i=n; i>=0; i--) {

		for(int s=1 ;s<=n; s++) {
			System.out.print(" ");
		}
			for (int j=1 ; j<=i*2-1; j++) {
				System.out.print("*");
			}
		
	
System.out.println();
}}
}