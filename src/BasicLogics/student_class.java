package BasicLogics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	String name;
	int regNo;
	int marksInEng;
	int marksInMath;
	int marksInScience;

	public Student(int id, String s, int eng, int math, int sci) {
		name = s;
		regNo = id;
		marksInEng = eng;
		marksInMath = math;
		marksInScience = sci;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public int getMarksInEng() {
		return marksInEng;
	}

	public int getMarksInMath() {
		return marksInMath;
	}

	public int getMarksInScience() {
		return marksInScience;
	}

	public String toString() {
		return "name: " + name + "\t" + " and Registration number: " + regNo;
	}
}

class Sortbyroll implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		return s1.getRegNo() - s2.getRegNo();
	}

}

class Sortbyper implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		return (s2.getMarksInEng()) / 100 - (s1.getMarksInEng()) / 100;
	}

}

class SortbyMaths implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		return s2.getMarksInMath() - s1.getMarksInMath();
	}

}

class SortbyTotal implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		return (s1.getMarksInMath() + s1.getMarksInScience()) - (s2.getMarksInMath() + s2.getMarksInScience());
	}

}

public class student_class {

	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<>();
		ar.add(new Student(131, "Sathish", 517, 80, 45));
		ar.add(new Student(101, "Chandu", 531, 36, 56));
		ar.add(new Student(121, "Vandana", 650, 29, 95));
		ar.add(new Student(111, "Archana", 910, 47, 82));
		ar.add(new Student(116, "chandana", 375, 95, 07));

		System.out.println(
				"Display the entire regNo and the name of the student in the class in the ascending order of regNo");
		Collections.sort(ar, new Sortbyroll());
		ar.forEach(System.out::println);
		System.out.println();

		System.out.println("Display the entire regNo and the name of the student who has got the highest percentage");
		Collections.sort(ar, new Sortbyper());
		System.out.println(ar.get(0));
		System.out.println();

		System.out
				.println("Display the entire regNo and the name of the student who has got the highest marks in maths");
		Collections.sort(ar, new SortbyMaths());
		System.out.println(ar.get(0));
		System.out.println();

		System.out.println(
				"Display the entire regNo and the name of the student in the ascending order of the total marks in mathematics and science alone");
		Collections.sort(ar, new SortbyMaths());
		ar.forEach(System.out::println);
		System.out.println();
	}

}




