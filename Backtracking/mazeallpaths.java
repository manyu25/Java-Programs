package Backtracking;
import java.util.Arrays;
public class mazeallpaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
//        allpaths("", maze,0,0);
        allpathsprint("", maze,0,0,path,1);
    }
    static void allpaths(String newer, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(newer);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // that means now we are considering the next cell in our path so we should mark it as false.
        maze[r][c] = false;

        if(r < maze.length-1) {
            allpaths(newer + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length-1) {
            allpaths(newer + 'R', maze, r, c + 1);
        }
        if(r > 0){
            allpaths(newer + 'U', maze, r-1, c);
        }
        if(c > 0){
            allpaths(newer + 'L', maze, r, c-1);
        }

        //now since the work of function is over we will come out of it now....so changes made should be removed..
        maze[r][c] = true;
    }

    static void allpathsprint(String newer, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
           for(int[] arr: path){
               System.out.println(Arrays.toString(arr));
           }
            System.out.println(newer);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // that means now we are considering the next cell in our path so we should mark it as false.
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1) {
            allpathsprint(newer + 'D', maze, r + 1, c,path,step+1);
        }
        if (c < maze[0].length-1) {
            allpathsprint(newer + 'R', maze, r, c + 1,path,step+1);
        }
        if(r > 0){
            allpathsprint(newer + 'U', maze, r-1, c,path,step+1);
        }
        if(c > 0){
            allpathsprint(newer + 'L', maze, r, c-1,path,step+1);
        }

        //now since the work of function is over we will come out of it now....so changes made should be removed..
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
