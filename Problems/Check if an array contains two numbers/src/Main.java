import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean c = true;

        for (int j = 1; j < size; j++) {
            if (a[j - 1] == n && a[j] == m || a[j] == n && a[j - 1] == m) {
                c = true;
                break;
            } else {
                c = false;
            }
        }
        System.out.println(c);
    }
}