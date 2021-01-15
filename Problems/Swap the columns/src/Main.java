import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] cubic = new int[a][b];

        for (int j = 0; j < a; j++) {
            for (int k = 0; k < b; k++) {
                cubic[j][k] = scanner.nextInt();
            }
        }
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            int temp = cubic[i][c];
            cubic[i][c] = cubic[i][d];
            cubic[i][d] = temp;
        }

        for (int j = 0; j < a; j++) {
            for (int k = 0; k < b; k++) {
                System.out.print(cubic[j][k] + " ");
            }
            System.out.println();
        }

    }
}
