package Backtracking;

public class maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        paths("",3,3);
//        System.out.println(countdiag(3,3));
//        pathsdiag("", 3,3);

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathsobs("", maze,0,0);
    }

    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        return count(r-1, c) + count(r, c-1);
    }


    static void paths(String newer, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(newer);
            return;
        }
        if(r>1) {
            paths(newer + 'D', r - 1, c);
        }
        if (c>1) {
            paths(newer + 'R', r, c - 1);
        }
    }


    static int countdiag(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        if(r>1 && c>1){
           return count(r-1, c-1);
        }
        return count(r-1, c) + count(r, c-1);
    }

    static void pathsdiag(String newer, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(newer);
            return;
        }
        if(r>1) {
            pathsdiag(newer + 'D', r - 1, c);
        }
        if (c>1) {
            pathsdiag(newer + 'R', r, c - 1);
        }
        if(r>1 && c>1){
            pathsdiag(newer + "d", r-1, c-1);
        }
    }


    // maze with obstacles...
    static void pathsobs(String newer, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(newer);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1) {
            pathsobs(newer + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length-1) {
            pathsobs(newer + 'R', maze, r, c + 1);
        }
    }
}
