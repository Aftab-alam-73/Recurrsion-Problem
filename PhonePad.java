import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        // pad("", "12");
        System.out.println(padRet("", "12"));
       System.out.println(count("", "12"));
    }
    //Printing all the combinations;
     static void pad(String p,String up) {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*3);i++)
        {
            char ch=(char)('a'+i);
            pad(p+ch, up.substring(1));
        }
        
    } 
    //Returning the all combination in the arraylist
     static ArrayList<String> padRet(String p,String up) {

        if(up.isEmpty())
        {
           ArrayList<String>list=new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String>list=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*3);i++)
        {
            char ch=(char)('a'+i);
           list.addAll(padRet(p+ch, up.substring(1)));
        }
        return list;
    } 
    //counting the number of combinations
    static int count(String p,String up) {

        if(up.isEmpty())
        {
          
           return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*3);i++)
        {
            char ch=(char)('a'+i);
          count=count+ count(p+ch, up.substring(1));
        }
        return count;
    }
    
}
