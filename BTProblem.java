import java.util.Arrays;

public class BTProblem {
    public static void main(String[] args) {
        boolean[][]maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
       int[][]path=new int[maze.length][maze[0].length];
        backtrack(maze, 0, 0, "", path, 1);
    }
    static void backtrack(boolean [][]maze,int r,int c,String p ,int path[][],int step){
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            path[r][c]=step;
            for(int[] a:path)
            {
             System.out.println(Arrays.toString(a));
            }
          System.out.println(p);
          return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1)
        {
            backtrack(maze, r+1, c, p+'D',path,step+1);
        }
        if(c<maze[0].length-1)
        {
            backtrack(maze, r, c+1, p+'R',path,step+1);
        }
        if(r>0)
        {
            backtrack(maze, r-1, c, p+'U',path,step+1);
        }
        if(c>0)
        {
            backtrack(maze, r, c-1, p+'L',path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
