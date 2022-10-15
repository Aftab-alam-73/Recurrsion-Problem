public class PowerOfTwoOrNot{
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
    static boolean isPowerOfTwo(int n)
    {
        if(n<2)return false;
      else  if(n==2)return true;
      else  if(n%2!=0)return false;
      else{
        n/=2;
        if(n==1)return true;
      }
      return isPowerOfTwo(n);
    }
}