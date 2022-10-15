import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String str="abc";
        // subseq("", str);
        // System.out.println(subseqRet("", "abc"));
        // subseqAsci("", str);
        System.out.println(subseqAsciRet("", "abc"));

    }
    static void subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));

    }
    //Returnig the list of subsequences
     static ArrayList<String> subseqRet(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
      ArrayList<String>left= subseqRet(p+ch, up.substring(1));
      ArrayList<String>right=  subseqRet(p, up.substring(1));
      left.addAll(right);
      return left;

    }
    // Subsequence with ASCII value
    static void subseqAsci(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseqAsci(p+ch, up.substring(1));
        subseqAsci(p, up.substring(1));
        subseqAsci(p+(ch+0), up.substring(1));

    } 
    //Returning Subsequence with ASCII value
    static ArrayList<String> subseqAsciRet(String p,String up)
    {
        if(up.isEmpty())
        {
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }
        char ch=up.charAt(0);
       ArrayList<String>first= subseqAsciRet(p+ch, up.substring(1));
       ArrayList<String>second=  subseqAsciRet(p, up.substring(1));
       ArrayList<String>third=  subseqAsciRet(p+(ch+0), up.substring(1));
       first.addAll(second);
       first.addAll(third);
       return first;

    }
}
