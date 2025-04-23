
public class New {

	public static void main(String[] args) {
		pri(7);

	}
	
	public static void pri(int num) {
		int num1=0;
		int num2=1;
		int result=0;
		System.out.print(num1 +" ");
		System.out.print(num2+ " ");
		for(int i=1; i<=num; i++) {
			result=num1+num2;
			System.out.print(result+" ");
			num1=num2;
			num2=result;
		}
	}
}
