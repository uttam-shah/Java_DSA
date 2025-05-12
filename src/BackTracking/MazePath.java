package BackTracking;

public class MazePath {
    public static void main(String[] args) {
        int rows = 4;
        int column = 6;
        maze(0, 0, rows-1, column-1, "");
    }

    private static void maze(int sr, int sc, int er, int ec, String ans) {

        if (sr > er || sc > ec) return ;
        if (sr == er && sc == ec){
            System.out.println(ans);
            return;
        }
        //go down
        maze(sr+1, sc, er, ec,ans+"D" );

        //go Right
        maze(sr, sc+1, er, ec, ans+"R");


    }
}
