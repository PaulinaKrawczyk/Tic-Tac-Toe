import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] element = new int[size];
        for (int i = 0; i < size; i++) {
            element[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (element[i] > number) {
                sum += element[i];
            }
        }
        System.out.println(sum);
    }
}