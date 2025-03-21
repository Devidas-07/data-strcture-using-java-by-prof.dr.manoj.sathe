package quick;

public class QuickSort {

	public static void main(String[] args) {
		int [] arr = {67,54,87,112,4,9876};
		System.out.println("before sorted array");
		for(int n: arr) {
			System.out.print(n +" ");
		}
		System.out.println("after sorted array");
		quickSort(arr, 0, arr.length-1);
		for(int n: arr) {
			System.out.print(n +" ");
		}

	}
	static void quickSort(int [] a, int low, int high) {
		if(low<high) {
			int index =divide(a, low, high);
			quickSort(a, low, index-1);
			quickSort(a, index+1, high);
		}
	}
	static int divide(int [] a, int low, int high) {
		int j=low-1;
		int pivot=a[high];
		for(int i=low; i<high; i++) {
			if(a[i]<pivot) {
				j++;
				//swap(i, j, a);
			}
			
		}
		swap(j+1,high,a);
		return j+1;
	}
	static void swap(int i,int j, int []a) {
		int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
	}

}
