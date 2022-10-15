public class DiceProblem {
    public static void main(String[] args) {
        Dice("", 4);
    }
    static void Dice(String p,int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
            Dice(p+i, target-i);
        }
    }
}
