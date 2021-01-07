import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        int elements = 1;
        int max = 1;
        for (int j = 1; j < size; j++) {
            if (a[j - 1] <= a[j]) {
                elements++;
                max = elements;
            } else {
                elements = 1;
            }

        }
        System.out.println(max);
    }
}