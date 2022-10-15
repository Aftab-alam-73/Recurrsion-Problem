import java.util.Arrays;

public class MinAndMaxValue {
    public static void main(String[] args) {
        int[]arr = {1};
        System.out.println(Arrays.toString(findminandmax(arr)));
    }
    static int[] findminandmax(int arr[])
    {
        return find(arr,arr[0],arr[0],1);
    }

    static int[] find(int arr[],int min,int max,int i){
        if(arr.length==i)
        {
            return new int[]{min,max};
        }
        if(min>arr[i]){
            min=arr[i];
        }
        if(max<arr[i])
        {
            max=arr[i];
        }
        return find(arr, min, max, i+1);
    }
}
