public class Pattern {
    public static void main(String[] args) {
        print(100, 100);
    }
    static void print(int r,int c)
    {
        if(r==0)return;
        if(c==0)
        {
            r=r-1;
            c=r;
            System.out.println();
            
        }
        if(c>0)
        {
            System.out.print("*");
            print(r, c-1);
        }
    }
    
}
