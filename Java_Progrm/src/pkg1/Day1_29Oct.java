package pkg1;

public class Day1_29Oct
{
	// Day 1 29th Oct Assignment 1
	
	int age,rollno;
	
	public void display1() {
		
		System.out.println("Welcom all of you");
	}

	public void display2() {
		
		System.out.println("Automation is easy");
	}

	public static void main(String[] args) {
		
		Day1_29Oct stu =new Day1_29Oct();	
		System.out.println("Calling methods");
		
		stu.display1();
		stu.display2();
		System.out.println();
		System.out.println("Calling variable");
		stu.age = 23;
		stu.rollno = 897;
		
		System.out.println("Value of 1st variable-Age :" + stu.age);
		System.out.println("Value of 2nd variable-Rollno :" + stu.rollno);
	}
}
