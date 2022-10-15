public class Fabonacci {
    public static void main(String[] args) {
        System.out.println(fabonaccinumber(10));
    }
    static int fabonaccinumber(int n)
{
    if(n<2)
    {
        return n;
    }
    return fabonaccinumber(n-1)+fabonaccinumber(n-2);
}
    
}
