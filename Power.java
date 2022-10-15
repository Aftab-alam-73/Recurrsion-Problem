public class Power {
    public static void main(String[] args) {
        System.out.println(Power(2, 3));
    }
  static int Power(int x,int y)  
  {
    if(y==0)
    {
        return 1;
    }
     int z=Power(x, y-1);
     int xn=x*z;
    return  xn;
  }
}
