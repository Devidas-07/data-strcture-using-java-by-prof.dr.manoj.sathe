package quick;

public class BySir {
    public static void main(String[] args) {
        int[] arr = {10,80,30,90,40,50,70};
        quicksort(arr,0,arr.length-1);

        for(int k=0;k<arr.length;k++)
            System.out.print(arr[k] + " ");
        System.out.println();
    }
    static void quicksort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low,high);
            quicksort(arr,low,pi-1); //low=0,pi-1=3
            quicksort(arr,pi+1,high);//pi+1=5,high=6

        }
    }
    static int partition(int[] arr,int low,int high)
    {
        int piv = arr[high];
        int j = low - 1;
        for(int i=low;i<=high-1;i++)
        {
            if(arr[i] < piv)
            {
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j+1,high);
        return j+1;

    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
