import java.util.ArrayList;

public class RockInPath {
    public static void main(String[] args) {
        boolean[][]maze={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        // Pathrestriction(maze, "", 0, 0);
        System.out.println(PathrestrictionRet(maze, "", 0, 0));
    }
    // There is a rock in the path so we cant go throgh 
    static void Pathrestriction(boolean[][]maze,String p,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false)
        {
            return;
        }
        if(r<maze.length-1)
        {
            Pathrestriction(maze, p+'R', r+1, c);
        }
        if(c<maze[0].length-1)
        {
            Pathrestriction(maze, p+'D', r, c+1);
        }
    }
    // Returning the path in the list.
    static ArrayList<String> PathrestrictionRet(boolean[][]maze,String p,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            ArrayList<String>list=new  ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new  ArrayList<>();
        if(maze[r][c]==false)
        {
            return new ArrayList<>();
        }
        if(r<maze.length-1)
        {
            list.addAll(PathrestrictionRet(maze, p+'R', r+1, c));
        }
        if(c<maze[0].length-1)
        {
            list.addAll(PathrestrictionRet(maze, p+'D', r, c+1));
        }
        return list;
    }
    
}
