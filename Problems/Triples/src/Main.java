import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        int triples = 0;
        for (int j = 0; j < size - 2; j++) {
            if (a[j] + 1 == a[j + 1]  && a[j + 1] + 1  == a[j + 2]) {
                triples++;
            }

        }
        System.out.println(triples);
    }
}