public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(73732348));
    }
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int num=n%10;
        return num+sum(n/10);
    }
}
