package martinek;

public class Main {
    public static int[][] matrix = new int[][]{{ 2, 5, 9, 8, 1},
                                               { 8, 9,-5, 2, 7},
                                               { 1, 8, 7, 9, 2},
                                               {-2, 4, 0, 7, 2} };

    public static void main(String[] args) {
        int diagonalProduct = 1;
        int nextDiagonalProduct = 1;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) diagonalProduct *= matrix[i][j];
                if (j == matrix[0].length - 1 - i) nextDiagonalProduct *= matrix[i][j];
            }

        System.out.println("Súčin na hlavnej diagonale: "+diagonalProduct);
        System.out.println("Súčin na vedľajšej diagonale: "+nextDiagonalProduct);
    }
}
