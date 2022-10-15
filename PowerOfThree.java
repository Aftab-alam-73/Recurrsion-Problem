
public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPower(27));
    }
    static    boolean isPowerOfThree(int n) {
        while(n>=3)
        {
            if(n%3!=0) return false;
            n/=3;
        }
        return n==1;
    }
    static boolean isPower(int n) {
        if(n<= 0) return false;
        if(n == 1) return true;
        if(n %3 == 1 || n%3 == 2) return false;
        return isPowerOfThree(n/3);
        }
}
