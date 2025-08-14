 package selection;


public class SelectionSort {

	public static void main(String[] args) {
		int [] a = {23,12,87,33,65,789,13};
		for(int i=0; i<a.length-1; i++) { //one less position
			int startIndex=i;
			
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[startIndex]) {
					startIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[startIndex];
			a[startIndex]=temp;
		}
		
		System.out.println("sorted array: ");
		for(int s: a) {
			System.out.println(s);
		}

	}

}
