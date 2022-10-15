import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={5,3,6,1,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr)
    {
       sort(arr, 1);
    }
    static void sort(int arr[],int j)
    {
        if(arr.length==j)
        {
            return;
        }
        int i=j;
        while(i>0)
        {
            if(arr[i]<arr[i-1])
            {
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            i--;
        }
        sort(arr, j+1);
    }
}
