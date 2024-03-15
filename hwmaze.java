public class hwmaze {

    public static void mazeWays(int maze[][], int solmaze[][], int x, int y) {
        // base case
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            printMaze(solmaze);
            solmaze[x][y] = 0;
            return;
        }
        // recursion
        // left
        if (y > 0) {
            if (maze[x][y - 1] == 1 && solmaze[x][y - 1] != 1) {

                solmaze[x][y - 1] = 1;
                mazeWays(maze, solmaze, x, y - 1);
            }
        }
        // right
        if (y < maze.length - 1) {
            if (maze[x][y + 1] == 1 && solmaze[x][y + 1] != 1) {
                solmaze[x][y + 1] = 1;
                mazeWays(maze, solmaze, x, y + 1);
            }
        }
        // up
        if (x > 0) {
            if (maze[x - 1][y] == 1 && solmaze[x - 1][y] != 1) {
                solmaze[x - 1][y] = 1;
                mazeWays(maze, solmaze, x - 1, y);
            }
        }
        // down
        if (x < maze.length - 1) {
            if (maze[x + 1][y] == 1 && solmaze[x + 1][y] != 1) {
                solmaze[x + 1][y] = 1;
                mazeWays(maze, solmaze, x + 1, y);
            }
        }
        solmaze[x][y] = 0;
    }

    public static void printMaze(int solmaze[][]) {
        System.out.println("--------Maze--------");
        for (int i = 0; i < solmaze.length; i++) {
            for (int j = 0; j < solmaze.length; j++) {
                System.out.print(solmaze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int solmaze[][] = new int[maze.length][maze.length];
        solmaze[0][0] = 1;
        mazeWays(maze, solmaze, 0, 0);
    }
}
