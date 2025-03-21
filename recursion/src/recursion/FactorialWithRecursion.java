package recursion;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		int result = fact(3);
		System.out.println(result);

	}
	public static int fact(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		return num* fact(num-1);
	}
}
