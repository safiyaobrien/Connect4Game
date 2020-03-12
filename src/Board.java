public class Board {

    int size = 8;
    String[][] grid = new String[size][size];  //make 8x8 2D array of strings

    public Board() {

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {

                grid[row][col] = "0";

            }
        }

    }

    public void printBoard() {
        System.out.println("Updated board:");
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {

                System.out.print(grid[row][col] + " ");  //prints out each value in each array

            }
            System.out.print("\n");  // "\n" is the character for "new line"
        }


    }

