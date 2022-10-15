import java.util.ArrayList;

public class FindAllindexes {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,4,7,4};
        System.out.println(findAllindexes(arr, 1));
    }
    static ArrayList<Integer> findAllindexes(int arr[],int target)
    {
        ArrayList<Integer>list=new ArrayList<>();
        return find(arr,target,list,0);
    }
    static ArrayList<Integer> find(int arr[],int target,ArrayList<Integer>list,int i)
    {
        if(arr.length==i)
        {
            return list;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        return find(arr, target, list, i+1);
    }
}
