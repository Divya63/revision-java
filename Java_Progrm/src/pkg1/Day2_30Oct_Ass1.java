
package pkg1;

public class Day2_30Oct_Ass1
{
	//Solving expression (((((10+2)+2)-2)*2)/2)
	
	public int sum(int a, int b) {
		int res_sum = a +b;
		return res_sum;
	}
	
	public int diff(int a, int b) {
		int res_diff = a-b;
		return res_diff;
	}
	
	public int mul(int a, int b) {
		int res_mul = a * b;
		return res_mul;
	}
	
	public void divide(int a, int b) {
		float res_divide = a/b;
		System.out.println("Final result: " + res_divide);
	}

	public static void main(String[] args) {
		Day2_30Oct_Ass1 dc = new Day2_30Oct_Ass1();
		System.out.println("Solving expression (((((10+2)+2)-2)*2)/2)");
		int res1 = dc.sum(10, 2);
		int res2 = dc.sum(res1, 2);
		int res3 = dc.diff(res2, 2);
		int res4 = dc.mul(res3, 2);
		dc.divide(res4, 2);		
	}
}
