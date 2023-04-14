public class Main {
    private static String[][] maze1 = {
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL,
                    Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY,
                    Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY },
            { Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY,
                    Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY,
                    Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL },
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.WALL,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY,
                    Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.START, Maze.EMPTY, Maze.WALL, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL,
                    Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL },
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL } };
    private static String[][] maze2 = {
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL,
                    Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY },
            { Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.WALL,
                    Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY,
                    Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.EMPTY,
                    Maze.WALL, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY,
                    Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.WALL, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.START, Maze.WALL, Maze.EMPTY,
                    Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.WALL,
                    Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.WALL, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY, Maze.EMPTY,
                    Maze.EMPTY, Maze.EMPTY, Maze.WALL },
            { Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL,
                    Maze.WALL, Maze.WALL } };

    public static void main(String[] args) {
        Maze maze = new Maze(maze1);
        System.out.println("Unsolved maze:");
        System.out.println(maze);
        maze.solve();
        System.out.println("Solved maze:");
        System.out.println(maze);

        maze = new Maze(maze2);
        System.out.println("Unsolved maze:");
        System.out.println(maze);
        maze.solve();
        System.out.println("Solved maze:");
        System.out.println(maze);
    }
}