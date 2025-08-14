package leetcode;
//given an array and target element you have to return index of two such elements their addition is target element
public class Array_TwoSum {

	public static void main(String[] args) {
		int [] arr = {5,3,8,1,4,11,7};
		int target=15;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("indexes are "+i +" "+"and "+j);
					break;
				}
				else {
					System.out.println("not founded");
				}
			}
		}

	}

}
//time complexity: O(n2)
