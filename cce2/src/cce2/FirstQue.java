package cce2;

public class FirstQue {

	public static void main(String[] args) {
		int [] qArray= {23,78,12,89};
		System.out.println("before sorted");
		for(int num: qArray) {
			System.out.print(num + " ");
		}
		sort(qArray);
		System.out.println("after sorted");
		for(int num: qArray) {
			System.out.print(num + " ");
		}

	}
	static void sort(int []a) {
		int n = a.length;  
        for (int i = 0; i < n - 1; i++) {  
        	int con=n-i-1;
            for (int j = 0; j < con; j++) {  
                if (a[j] > a[j + 1]) {  
                    
                    int temp = a[j];  
                    a[j] = a[j + 1];  
                    a[j + 1] = temp;  
                }  
            }  
        } 
	}
}
