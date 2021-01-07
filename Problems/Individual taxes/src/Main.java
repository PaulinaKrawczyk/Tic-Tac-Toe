import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] income = new int[size];
        for (int i = 0; i < size; i++) {
            income[i] = scanner.nextInt();
        }
        int[] tax = new int[size];
        for (int i = 0; i < size; i++) {
            tax[i] = scanner.nextInt();
        }
        double max = 0;
        double  c;
        int company = 0;
        for (int i = 0; i < size; i++) {
            c = income[i] * tax[i] / 100.00;
            if (c > max) {
                max = c;
                company = i + 1;
            }
        }
        System.out.println(company);
    }
}
