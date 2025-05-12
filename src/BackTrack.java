public class BackTrack {

    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println(maze(1,1,3,3));
       printMaze(1,1,3,3, "");
    }

    public static int maze(int sr, int sc, int er, int ec){
        if(sr > er || sc > ec) return 0;
        if (sr == er && sc == ec) return 1;
        int downWays = maze(sr+1, sc, er, ec);
        int rightWays = maze(sr , sc+1, er, ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }

    public static void printMaze(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) return;

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // go down
        printMaze(sr + 1, sc, er, ec, s + "D");

        // go right
        printMaze(sr, sc + 1, er, ec, s + "R");
    }

}

