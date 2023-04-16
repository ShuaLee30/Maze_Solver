public class Maze {
    public final static String WALL    = "+";
    public final static String START   = "S";
    public final static String PATH    = "O";
    public final static String DEADEND = "X";
    public final static String EMPTY   = " ";
    public final static String FINISH  = "!";
    private String[][] maze;
    private int startX;
    private int startY;

    Maze(String[][] input) {
        maze = input;
        findStartPosition();
        System.out.println(isOnEdge(1,1));
    }

    public void solve() {
        searchFrom(startX, startY);
    }

    public String toString() {

        String output = "";

        for (int r = 0; r < maze.length; r++){

            for(int c = 0; c < maze[0].length; c++){
                System.out.print(maze[r][c]);
            }
            System.out.println();
        }

        return output;

    }

    private void findStartPosition() {

        for (int r = 0; r < maze.length; r++){

            for (int c = 0; c < maze[0].length; c++){

                if (maze[r][c].equals(START)){
                    startX = r;
                    startY = c;
                }
            }


        }

        System.out.println(startX);
        System.out.println(startY);

    }


    private boolean isOnEdge(int row, int col) {

        if (row == 0){
            return true;
        }

        if (col == 0){
            return true;
        }

        if (row == maze.length - 1){
            return true;
        }

        if (col == maze[0].length - 1){
            return true;
        }

        return false;
    }

    private boolean searchFrom(int startRow, int startCol) {
        boolean found = false;
        return found;
    }
}
