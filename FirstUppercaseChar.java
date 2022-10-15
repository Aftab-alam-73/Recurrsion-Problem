public class FirstUppercaseChar {
    public static void main(String[] args) {
        String s="geekS";
        System.out.println(firstUppercase(s));
    }
    static char firstUppercase(String s)  
    {
        if(s.isEmpty())
        {
            return 'm';
        }
        if(s.charAt(0)>=65 && s.charAt(0)<97)
        {
            return s.charAt(0);
        }
       return firstUppercase(s.substring(1));
    }
}
