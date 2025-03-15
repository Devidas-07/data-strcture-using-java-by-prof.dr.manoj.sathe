package fibonacci;


public class FibonacciSearch {

	public static void main(String[] args) {
		int [] arr = {3,5,7,9,67,89,445,678};
		System.out.println(arr.length);
		int n = arr.length-1;
		
		int rs =search(arr, 3, n);
		if(rs<1) {
			System.out.println("element not present in array");
		}
		else {
		System.out.println("element found at : "+rs);
		}

	}
	public static int search(int [] arr, int target, int len) {
		int first=0;
		int second=1;
		int fib=first+second;
		System.out.println("len is "+len);
		while(fib<len) {
			//System.out.println(fib);
			first=second;
			second=fib;
			fib=first+second;
		}
		System.out.println("fib value is: "+fib);
		int offset=-1;
		
		
		while(fib>1) {
			int index = smaller(offset+first, len-1);
			
			if(arr[index]<target) {
				fib=second;
				second=first;
				first=fib-second;
				
				offset=index;
			}
			else if(arr[index]>target){
				fib=first;
				second=second-first;
				first=fib-second;
			}
			else if(arr[index]==target) {
				return index;
			}
			
		}
		return  -1;
	}
	public static int smaller(int x, int y) {
		if(x<y) {
			return x;
		}
		else {
			return y;
		}
	}

}

