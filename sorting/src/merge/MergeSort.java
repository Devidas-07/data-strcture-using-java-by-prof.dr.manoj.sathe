package merge;


public class MergeSort {

	public static void main(String[] args) {
		int [] a = {48,36,13,52,19,94,21};
		divide(0, a.length-1, a);
		for (int val : a) {  
            System.out.print(val + " ");  
        }  
        System.out.println(); 

	}
	public static void divide(int l, int r, int[] arr) {
		if(l<r) {
			System.out.println();
			int mid=(l+r)/2;
			divide(l, mid, arr);
			divide(mid+1, r, arr);
			merge(l, mid, r, arr);
		}
	}
	public static void merge(int l, int mid, int r, int [] arr) {
		
		for(int e: arr) {
			System.out.println(e + " ");
		}
		int n1 = mid - l + 1;  
        int n2 = r - mid;  

        int[] L = new int[n1];  
        int[] R = new int[n2];  

        for (int i = 0; i < n1; ++i)  
            L[i] = arr[l + i];  
        for (int j = 0; j < n2; ++j)  
            R[j] = arr[mid + 1 + j];  

        int i = 0, j = 0, k = l;  
        while (i < n1 && j < n2) {  
            if (L[i] <= R[j]) {  
                arr[k] = L[i];  
                i++;  
            } else {  
                arr[k] = R[j];  
                j++;  
            }  
            k++;  
        }  
//it may possible that one of array could be not complete
        //copy the remaining element
        while (i < n1) {  
            arr[k] = L[i];  
            i++;  
            k++;  
        }  

        while (j < n2) {  
            arr[k] = R[j];  
            j++;  
            k++;  
        }  
	}

}


