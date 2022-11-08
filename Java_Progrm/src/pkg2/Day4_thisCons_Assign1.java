package pkg2;

public class Day4_thisCons_Assign1 {
// this keyword in calling constructor
	
	public Day4_thisCons_Assign1() {
		this(5,47,5,66);
		System.out.println("Default Constructor");
	}
	
	public Day4_thisCons_Assign1(int a) {
		this();
		System.out.println("One parametrized constructor ");
	}
	
	public Day4_thisCons_Assign1(float c, float d) {
		this(3,5,7);
		System.out.println("Two parametrized constructor ");
	}
	
	public Day4_thisCons_Assign1(int f, int r, int h) {
		this(66);
		System.out.println("Three parametrized constructor ");
	}
	
	public Day4_thisCons_Assign1(int f, int r, int h, int e) {
		System.out.println("Four parametrized constructor ");
	}
	
	public static void main(String[] args) {
		Day4_thisCons_Assign1 hu = new Day4_thisCons_Assign1(4.5f, 7.9f);
		
	}
}









//3 parameterized method
//default method
////4 parameterized method
//1 parameterized method
//2 parmaeterized method