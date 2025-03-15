package insertion;


public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 5, 1, 6, 2, 4, 3 };
		int temp;
		int i;

		for (i = 1; i < a.length; i++) {
			temp=a[i];
			int j=i-1;
			while(j>=0 && temp<a[j]) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		System.out.println("sorted array: ");
		for(int s: a) {
			System.out.println(s);
		}
	}
}

