package binary;

public class BinarySearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] a= {{12,45,56},{48,78,90}};
		search(a, 78);

	}
	public static void search(int [][] arr, int target) {
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++) {
				System.out.print(arr[r][c] +"\t");
			}
			System.out.println( " ");
		}
		int row=0;
		int col=arr.length-1;
		
		while(row<arr.length && col>=0) {
			if(arr[row][col]==target) {
				System.out.println("element found at "+row +" "+col +" "+" position");
			}
			else if(arr[row][col]<target) {
				row++;
			}
			else {
				col--;
			}
		}
	}

}
