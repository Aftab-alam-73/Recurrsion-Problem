public class PrimeOrNot {
    public static void main(String[] args) {
        int  n = 15;
        System.out.println(CheckPrime(n));
    }
    static String CheckPrime(int n)
    {
        return check(n,2);
    }
    static String check(int n,int i)
    {
        if(i==n)
        {
            return "Yes";
        }
        if(n%i==0)
        {
            return "No";
        }
        return check(n, i+1);
    }
}
