import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] element = new int[size];
        for (int i = 0; i < size; i++) {
            element[i] = scanner.nextInt();
        }
        int sum = IntStream.of(element).sum();
        System.out.println(sum);
    }
}