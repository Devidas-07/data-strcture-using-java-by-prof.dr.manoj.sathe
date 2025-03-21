package recursion;

public class RecursionFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum(0);
		

	}
	static void printNum(int num) {
		if(num>6) {
			return;
		}
		printNum(num+1);
		System.out.println(num);
	}
}
