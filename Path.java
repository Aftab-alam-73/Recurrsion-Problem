import java.util.ArrayList;

public class Path {
    public static void main(String[] args) {
        // System.out.println(path(3, 3));
        // pathDir(3, 3, "");
        // ArrayList<String>ans=pathDirRet(3, 3, "");
        // System.out.println(ans);
        // System.out.println(pathDirAndNumOfPath(3, 3, ""));
        System.out.println(pathDirDiagonals(3,3,""));

    }
    //Returning the total  number of paths of a maze.
    static int  path(int r,int c)
    {
        if(r==1 || c==1)
        {
           return 1;
        }
        int count=0;
        if(r>1)
        {
            count=count+path(r-1, c);
        }
        if(c>1)
        {
            count=count+path(r, c-1);

        }
        return count;
    }
// Printing to full path with direction.
    static void  pathDir(int r,int c,String p)
    {
        if(r==1 && c==1)
        {
          System.out.println(p);
         
        }
      
        if(r>1)
        {
            pathDir(r-1, c,p+"R");
        }
        if(c>1)
        {
          pathDir(r, c-1,p+"D");

        }
      
    }
    // Returning the all paths in an Arraylist.
    static ArrayList<String>  pathDirRet(int r,int c,String p)
    {
        if(r==1 && c==1)
        {
         ArrayList<String>list=new  ArrayList<>();
         list.add(p);
         return list;
         
        }
        ArrayList<String>list=new  ArrayList<>();
        if(r>1)
        {
            list.addAll(pathDirRet(r-1, c,p+"R"));
        }
        if(c>1)
        {
            list.addAll(pathDirRet(r, c-1,p+"D"));

        }
      return list;
    }
    //Printing the all paths along with returning the total number of paths.
    static int  pathDirAndNumOfPath(int r,int c,String p)
    {
        if(r==1 && c==1)
        {
          System.out.println(p);
          return 1;
        }
        int count=0;
        if(r>1)
        {
            count=count+pathDirAndNumOfPath(r-1, c,p+"R");
        }
        if(c>1)
        {
          count=count+ pathDirAndNumOfPath(r, c-1,p+"D");

        }
       return count;
    }
// Returning the paths where we can go diagonaly also;
    static ArrayList<String>  pathDirDiagonals(int r,int c,String p)
    {
        if(r==1 && c==1)
        {
         ArrayList<String>list=new  ArrayList<>();
         list.add(p);
         return list;
         
        }
        ArrayList<String>list=new  ArrayList<>();
        if(r>1 && c>1)
        {
            list.addAll(pathDirDiagonals(r-1, c-1,p+"D"));

        }
        if(r>1)
        {
            list.addAll(pathDirDiagonals(r-1, c,p+"V"));
        }
        if(c>1)
        {
            list.addAll(pathDirDiagonals(r, c-1,p+"H"));

        }
      return list;
    }
}
