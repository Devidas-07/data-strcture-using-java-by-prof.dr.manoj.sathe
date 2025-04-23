
public class ArrayBasic {

	public static void main(String[] args) {
		int [] result= {45,23,89,90,23};
		long sum=0;
		for(int i=0; i<result.length; i++) {
			sum=sum+result[i];
		}
		System.out.println(sum);

	}

}
