import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] matrix = new int[a][b];
        int[][] temp = new int[b][a];
        int[][] newMatrix = new int[b][a];

        for (int j = 0; j < a; j++) {
            for (int k = 0; k < b; k++) {
                matrix[j][k] = scanner.nextInt();
            }
        }

   for (int j = 0; j < b; j++) {
            for (int k = 0; k < a; k++) {
                temp[j][k] = matrix[k][j];
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                newMatrix[i][j] =  temp[i][matrix.length - 1 - j];
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}