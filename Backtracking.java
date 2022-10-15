import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][]maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        backtrack(maze, 0, 0, "");
        System.out.println(backtrackRet(maze, 0, 0, ""));
    }
    //Printing the paths.
    static void backtrack(boolean [][]maze,int r,int c,String p){
        if(r==maze.length-1 && c==maze[0].length-1)
        {
          System.out.println(p);
          return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            backtrack(maze, r+1, c, p+'D');
        }
        if(c<maze[0].length-1)
        {
            backtrack(maze, r, c+1, p+'R');
        }
        if(r>0)
        {
            backtrack(maze, r-1, c, p+'U');
        }
        if(c>0)
        {
            backtrack(maze, r, c-1, p+'L');
        }
        maze[r][c]=true;

    }
    // Returning in an Arraylist
     static ArrayList<String> backtrackRet(boolean [][]maze,int r,int c,String p){
        if(r==maze.length-1 && c==maze[0].length-1)
        {
           ArrayList<String>list=new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        maze[r][c]=false;
        if(r<maze.length-1)
        {
           list.addAll( backtrackRet(maze, r+1, c, p+'D'));
        }
        if(c<maze[0].length-1)
        {
            list.addAll(backtrackRet(maze, r, c+1, p+'R'));
        }
        if(r>0)
        {
            list.addAll(backtrackRet(maze, r-1, c, p+'U'));
        }
        if(c>0)
        {
            list.addAll(backtrackRet(maze, r, c-1, p+'L'));
        }
        maze[r][c]=true;
       return list;
    }
}
