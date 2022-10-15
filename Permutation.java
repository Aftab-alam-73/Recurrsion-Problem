import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        // printpermu(str, "");
        System.out.println(printpermuRet(str, ""));
    }
    static void printpermu(String str,String permutation)
    {
        if(str.isEmpty())
        {
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            printpermu(newStr, permutation+currChar);
        }
    }
    //Returning the list
    static ArrayList<String> printpermuRet(String str,String permutation)
    {
        if(str.isEmpty())
        {
         ArrayList<String>list=new ArrayList<>();
         list.add(permutation);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
           list.addAll(printpermuRet(newStr, permutation+currChar));
        }
        return list;
    }
    
}
