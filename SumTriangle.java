// Link:- https://www.geeksforgeeks.org/sum-triangle-from-array/
import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        sumTriangle(A);
    }
    static void sumTriangle(int arr[]){
        if(arr.length<1)
        {
            return;
        }
        int temp[]=new int[arr.length-1];
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=arr[i]+arr[i+1];
        }
        sumTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
    
}
