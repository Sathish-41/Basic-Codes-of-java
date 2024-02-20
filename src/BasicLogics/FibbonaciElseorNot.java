package BasicLogics;
import java.util.Scanner;

public class FibbonaciElseorNot {
	
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("enter fib length ");
        int T = scanner.nextInt();


        for (int t = 0; t < T; t++) {
            System.out.print("Enter the integer (N) for test case "  + ": ");
            int N = scanner.nextInt();

            if (isFibonacci(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    private static boolean isFibonacci(int N) {
      /*  if (N == 0 || N == 1) {
            return true;
        }*/

        int a = 0, b = 1, c;
        while (true) {
            c = a + b;
            if (c == N) {
                return true;
            } else if (c > N) {
                return false;
            }
            a = b;
            b = c;
        }
    }
}