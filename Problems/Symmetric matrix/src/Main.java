import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] matrix = new int[a][a];

        for (int j = 0; j < a; j++) {
            for (int k = 0; k < a; k++) {
                matrix[j][k] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < a; k++) {
                if (matrix[i][k] != matrix[k][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}

