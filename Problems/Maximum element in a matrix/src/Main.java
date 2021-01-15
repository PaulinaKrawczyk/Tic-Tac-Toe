import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] matrix = new int[a][b];

        int maxJ = 0;
        int maxK = 0;
        for (int j = 0; j < a; j++) {
            for (int k = 0; k < b; k++) {
                matrix[j][k] = scanner.nextInt();
                if (matrix[j][k] > matrix[maxJ][maxK]) {
                    maxJ = j;
                    maxK = k;
                }
            }
        }
        System.out.println(maxJ + " " + maxK);
    }
}

