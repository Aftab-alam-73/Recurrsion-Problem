public class CheckSortedOrNot {
    public static void main(String[] args) {
        int []arr={1,2,6,3,4,5,6,7,8};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[]arr)
    {
        return check(arr,0);

    }
    static boolean check(int arr[],int i)
    {
        if(arr.length-1==i){
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return check(arr, i+1);
    }
}
