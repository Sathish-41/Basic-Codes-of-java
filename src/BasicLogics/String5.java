package BasicLogics;
public class String5 {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println(s.charAt(12));
		System.out.println(s.contains("is"));
		System.out.println(s+" and killed it.");
		System.out.println(s.endsWith("dog"));
		System.out.println(s.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s.equals("The quick brown for jump over the lazy  dog"));
		System.out.println(s.replace("The", "A"));
		System.out.println(s.split("fox"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("e"));
		String[] sr = s.split(" ");
		System.out.println(sr[3]);
		System.out.println(sr[sr.length-1]);
		
	}

}




