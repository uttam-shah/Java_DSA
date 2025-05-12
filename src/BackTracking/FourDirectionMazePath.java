package BackTracking;

public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int column = 3;
        boolean [][] isVisited = new boolean[rows][column];
        maze(0, 0, rows-1, column-1, "", isVisited);
    }

    private static void maze(int sr, int sc, int er, int ec, String ans, boolean[][] isVisited) {

        if (sr > er || sc > ec || sr < 0 || sc < 0) return ;
        if (isVisited [sr][sc] == true) return; // v imp
        if (sr == er && sc == ec){
            System.out.println(ans);
            return;
        }
        isVisited[sr][sc] = true;

        //go Right
        maze(sr, sc+1, er, ec, ans+"R", isVisited);

        //go down
        maze(sr+1, sc, er, ec,ans+"D", isVisited );

        //go left
        maze(sr, sc-1, er, ec, ans+"L", isVisited);

        //go up
        maze(sr-1, sc, er, ec, ans+"U", isVisited);
        isVisited[sr][sc] = false;


    }
}
