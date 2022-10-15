public class LengthOfString {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        System.out.println(length(str));
    }
    static int length(String s)
    {
       return len(s,0);
    }
    static int len(String s,int c)
    {
        if(s.isEmpty())
        {
            return c;
        }
        return len(s.substring(1), c+1);
    }
}
