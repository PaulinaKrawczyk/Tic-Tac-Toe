import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[][] cubic = new String[size][size];


        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (j == k || j + k == size - 1 || j == size / 2 || k == size / 2) {
                    cubic[j][k] = "*";

                } else cubic[j][k] = ".";
            }
        }
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                System.out.print(cubic[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
