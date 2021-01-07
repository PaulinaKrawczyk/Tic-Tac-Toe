import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        int product = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            product = a[i - 1] * a[i];
            if (product > max) {
                max = product;
            }
        }
        System.out.println(max);
    }
}