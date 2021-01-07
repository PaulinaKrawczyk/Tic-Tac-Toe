import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}

