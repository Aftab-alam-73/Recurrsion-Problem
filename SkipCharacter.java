public class SkipCharacter {
    public static void main(String[] args) {
        skip("", "abcadaeaafag");
        // String a=skip1("", "abcadaeaafag");
        String a=skip2("abcadaeaafag");
       System.out.println(a); 
    }
    //Not Returning anything.
    static void skip(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    } 
    //Returning a string.
    static String skip1(String p,String up)
    {
        if(up.isEmpty())
        {
            
            return p;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
           return skip1(p, up.substring(1));
        }
        else{
           return skip1(p+ch, up.substring(1));
        }
    } 
    // Returning a string without using extra variable.
    static String skip2(String up)
    {
        if(up.isEmpty())
        {
            
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
           return skip2( up.substring(1));
        }
        else{
           return ch+ skip2(up.substring(1));
        }
    }
}
