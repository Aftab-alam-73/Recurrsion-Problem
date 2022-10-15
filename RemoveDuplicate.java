public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        System.out.println(removedup(s));
    }
    static String removedup(String s)
    {
        return remove("",s);
    }
    static String remove(String p,String s)
    {
        if(s.isEmpty())
        {
            return p;
        }
        char ch=s.charAt(0);
       int a=p.indexOf(ch);
        if(a==-1){
           p=p+ch;
        }
        return remove(p, s.substring(1));
    }
}
