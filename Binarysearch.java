public class Binarysearch {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5,6,7,8}  ;
      System.out.println(binarysearch(arr, 0));
    }
    static int  binarysearch(int []arr,int val)
    {
       int last=arr.length-1;
       return search(arr,val,0,last);

    }
    static int search(int []nums,int target,int start,int end)
    {
        if(start>end)return -1;
        int mid=start+(end-start)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            end=mid-1;
        }
        else{
            start=mid+1;
        }
        return search(nums, target, start, end);
    }
}
