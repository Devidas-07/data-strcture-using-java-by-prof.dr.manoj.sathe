package linear;

public class UsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {48,36,13,52,19,94,21};
		int result = search(a,19,0);
		System.out.println(result);

	}
	static int search(int [] a, int t, int index) {
		if(a[index]==t) {
			return index;
		}
		else {
			return search(a,t,++index);
		}
	}
}
