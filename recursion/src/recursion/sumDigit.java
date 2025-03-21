package recursion;

public class sumDigit {

	public static void main(String[] args) {
		
		int r= sum(3456);
		System.out.println(r);

	}
	static int sum(int num) {
		if(num==0) {
			return 0;
		}
		return sum(num/10)+num%10;
	}

}
