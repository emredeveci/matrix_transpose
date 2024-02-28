public class Main {

    static int[][] transpose(int[][] array) {

        //create a new array that will fit the transposed matrix
        int rows = array.length;
        int cols = array[0].length;
        int[][] postTranspose = new int[cols][rows];

        //swap the columns and rows of the original array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                postTranspose[j][i] = array[i][j];
            }
        }
        return postTranspose;
    }

    //print a 2D array
    static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] preTranspose = {
                {2, 3, 4},
                {5, 6, 7}
        };

        System.out.println("Matrix:");
        printArray(preTranspose);

        System.out.println("Transposed:");
        printArray(preTranspose);
    }
}