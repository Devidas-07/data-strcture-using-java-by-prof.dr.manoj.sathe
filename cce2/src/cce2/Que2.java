package cce2;

public class Que2 {

	public static void main(String[] args) {
		
		int [] qArray= {23,78,12,89};
		int result = search(qArray, 89);
		
		if(result<0) {
			System.out.println("sorry not found");
		}
		else if(result>=0) {
			System.out.println("element founded at "+result +" index");
		}
	}
	static int  search(int []a , int target) {
		int index=-1;
		for(int i=0; i<a.length; i++) {
			if(a[i]==target) {
				index=i;
				break;
			}
			
		}
		return index;
	}
}
