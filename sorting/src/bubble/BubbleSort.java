package bubble;

public class BubbleSort {  

     

    public static void main(String[] args) {  
        int[] arr = {5, 1, 4, 2, 8};  
        bubbleSort(arr);  
        System.out.println("Sorted array:");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
    public static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        for (int i = 0; i < n - 1; i++) {  
        	int con=n-i-1;
            for (int j = 0; j < con; j++) {  
                if (arr[j] > arr[j + 1]) {  
                    
                    int temp = arr[j];  
                    arr[j] = arr[j + 1];  
                    arr[j + 1] = temp;  
                }  
            }  
        }  
    } 
}  
