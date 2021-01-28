import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] matrix = new int[a][b];

        for (int j = 0; j < a; j++) {
            for (int k = 0; k < b; k++) {
                matrix[j][k] = scanner.nextInt();
            }
        }

        int seats = scanner.nextInt();
        boolean available = false;
        int row = 0;
        for (int j = 0; j < a; j++) {
            int counter = 0;
            for (int k = 0; k < b; k++) {
                if (!available) {
                    if (matrix[j][k] == 0) {
                        counter++;
                    } else counter = 0;
                    if (seats == counter) {
                        available = true;
                        row = j + 1;
                    }
                }
            }
        }
        System.out.println(row);
    }
}

