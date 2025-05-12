package BackTracking;

public class RatInADeadMaze {
    public static void main(String[] args) {
        int rows = 3;
        int column = 4;
        int[][] maze = {{1,0,1,1,},
                        {1,1,1,1,},
                        {0,1,1,1,}};

        boolean[][] isVisited = new boolean[rows][column];

        maze(0, 0, rows-1, column-1, "",maze, isVisited);
    }

    //4 direction
    private static void maze(int sr, int sc, int er, int ec, String ans, int[][] maze, boolean[][] isVisited ) {

        if (sr > er || sc > ec || sr < 0 || sc < 0) return ;
        if (isVisited [sr][sc] == true) return; // v imp
        if (sr == er && sc == ec){
            System.out.println(ans);
            return;
        }
        if (maze[sr][sc] == 0) return;
        isVisited[sr][sc] = true;

        //go Right
        maze(sr, sc+1, er, ec, ans+"R", maze, isVisited);

        //go down
        maze(sr+1, sc, er, ec,ans+"D", maze, isVisited );

        //go left
        maze(sr, sc-1, er, ec, ans+"L", maze, isVisited);

        //go up
        maze(sr-1, sc, er, ec, ans+"U", maze, isVisited);
        isVisited[sr][sc] = false;

    }

    //two direction
    private static void maze(int sr, int sc, int er, int ec, String ans, int[][] maze) {

        if (sr > er || sc > ec) return ;
        if (sr == er && sc == ec){
            System.out.println(ans);
            return;
        }
        if (maze[sr][sc] == 0) return;
        //go down
        maze(sr+1, sc, er, ec,ans+"D", maze );

        //go Right
        maze(sr, sc+1, er, ec, ans+"R", maze);


    }
}
