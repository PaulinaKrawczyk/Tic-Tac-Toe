import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int square = a * a;
        int[][] matrix = new int[square][square];
        int[] sumRow = new int[square];
        int[] sumCol = new int[square];
        int[][] sumSmall = new int[a][a];
        int sum = square * (square + 1) / 2;
        boolean sudoku = true;

        for (int j = 0; j < square; j++) {
            for (int k = 0; k < square; k++) {
                matrix[j][k] = scanner.nextInt();
                sumRow[j] += matrix[j][k];
                sumCol[k] += matrix[j][k];
                sumSmall[j / a][k / a] += matrix[j][k];
            }
        }
        for (int i = 0; i < square; i++) {
            if (sumRow[i] != sum || sumCol[i] != sum) {
                sudoku = false;
                break;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (sumSmall[i][j] != sum) {
                    sudoku = false;
                    break;
                }
            }
        }

        System.out.println(sudoku ? "YES" : "NO");
    }
}

