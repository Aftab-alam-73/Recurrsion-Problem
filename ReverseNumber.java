public class ReverseNumber{
    static int sum=0;
    public static void main(String[] args) {
        reverse(12345);
        System.out.println(sum);
    }
    static void reverse(int n)
    {
        if(n==0)return;
        sum=sum*10+(n%10);
        reverse(n/10);
    }
}