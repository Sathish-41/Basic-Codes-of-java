package BasicLogics;


	import java.util.StringJoiner;


	public class stringbuilderclass {
		
		   public static void main(String args[]) {
		      String stringArray[] = {"Sathish "," barath",  " vijay ","swathi "," vinay", " ntr ", "anil "," bablu ", " Santhosh " ,"eshwar"};
		      StringJoiner joiner = new StringJoiner("");
		      for(int i = 0; i < stringArray.length; i++) {
		         joiner.add(stringArray[i]);
		      }
		      String str = joiner.toString();
		      System.out.println(str);
		   }
		}

