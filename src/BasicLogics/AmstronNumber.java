package BasicLogics;

public class AmstronNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =153;
		int temp;
		int t=0;
		int number;
		number = num;
		while(number!=0) {
			temp=number%10;
			t=t+(temp*temp*temp);
			number=number/10;
		}
	if (t==num) 
		System.out.println("am" +num);
		else
		
			System.out.println("not" + num);
	}
	
		/*int num = 370, number, temp, total = 0;

      //  number = num;
        while (num != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");*/
    }



