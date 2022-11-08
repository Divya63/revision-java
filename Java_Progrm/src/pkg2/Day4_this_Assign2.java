package pkg2;

public class Day4_this_Assign2 {
	// this keyword in calling method

	
	public void method_def() {
		System.out.println("Default method");
	}
	
	public void method_one(int a) {
		System.out.println("One parametrized method");
	}
	
	public void method_two(int g, int h) {
		this.method_one(67);
		System.out.println("Two parametrized method");
	}
	
	public void method_three(float e, float g, float b) {
		System.out.println("Three parametrized method");
		this.method_def();
		this.method_four(3, 5, 2.3f, 7.8f);
		this.method_one(33);
		this.method_two(445, 90);
	}
	
	public void method_four(int d, int k, float c, float f) {
		System.out.println("Four parametrized method");
	}
	
	public static void main(String[] args) {
		Day4_this_Assign2 n = new Day4_this_Assign2();
		n.method_three(5.6f, 4.4f, 3.2f);
		
		
	}
}

