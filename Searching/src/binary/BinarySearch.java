package binary;


public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {3,5,9,15,17,19,21,67,89,90};
		int target=90;
		
		int result =bsmthd(arr, target);
		if(result==-1) {
			System.out.println("our number is not founded in array");
		}
		else {
			System.out.println("number founded at: "+result);
		}

	}
	public static int bsmthd(int arr[], int t) {
		int left=0;
		int right=arr.length-1;
		int mid=0;
		
		while(left<=right) {
			mid=(left+right)/2;
			if(arr[mid]==t) {
				return mid;
			}
			else if(t<arr[mid]) {
				right=mid-1;
			}
			else if(t>arr[mid]) {
				left=mid+1;
			}
			
		}
		
		return -1;
	}

}

