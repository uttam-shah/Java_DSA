package BackTracking;

public class RatInMazeOptimized {
    public static void main(String[] args) {
        int rows = 3;
        int column = 4;
        int[][] maze = {{1,0,1,1,},
                        {1,1,1,1,},
                        {1,1,0,1,}};


        maze(0, 0, rows-1, column-1, "",maze);
    }

    private static void maze(int sr, int sc, int er, int ec, String ans, int[][] maze ) {

        if (sr > er || sc > ec || sr < 0 || sc < 0) return ;
        if (maze [sr][sc] == -1) return; // v imp
        if (sr == er && sc == ec){
            System.out.println(ans);
            return;
        }
        if (maze[sr][sc] == 0) return;
        maze[sr][sc] = -1;

        //go Right
        maze(sr, sc+1, er, ec, ans+"R", maze);

        //go down
        maze(sr+1, sc, er, ec,ans+"D", maze );

        //go left
        maze(sr, sc-1, er, ec, ans+"L", maze);

        //go up
        maze(sr-1, sc, er, ec, ans+"U", maze);
        maze[sr][sc] = 1;

    }
}
