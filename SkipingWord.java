public class SkipingWord {
    public static void main(String[] args) {
        skipword("", "aftabapplealam");
      String a=  skipword1( "aftabapplealam");
      System.out.println(a);
    }
    static void skipword(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        if(up.startsWith("apple")){
            skipword(p, up.substring(5));
        }else{
            char ch=up.charAt(0);
            skipword(p+ch, up.substring(1));
        }
    }
    //Returning a string.
    static String skipword1(String up)
    {
        if(up.isEmpty())
        {
           
            return "";
        }
        if(up.startsWith("apple")){
          return  skipword1( up.substring(5));
        }else{
            char ch=up.charAt(0);
           return ch+ skipword1(up.substring(1));
        }
    }
}
