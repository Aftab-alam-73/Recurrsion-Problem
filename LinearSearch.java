public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,2,6,3,4,5,6,7,8};
        System.out.println(linearsearch(arr, 7));
    }
    static boolean linearsearch(int arr[],int target)
    {
        return Search(arr,target,0);
    }
    static boolean Search(int arr[],int target,int i)
    {
        if(arr[i]==target)
        {
            return true;
        }
        if(arr.length-1==i)
        {
            return false;
        }
        return Search(arr, target, i+1);
    }
}
