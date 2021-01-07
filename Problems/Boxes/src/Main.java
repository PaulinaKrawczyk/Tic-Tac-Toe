import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] boxA = scanner.nextLine().split(" ");
        String[] boxB = scanner.nextLine().split(" ");
        Arrays.sort(boxA);
        Arrays.sort(boxB);
        int n = boxA.length;
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (boxA[i].compareTo(boxB[i]) > 0) {
                a++;
            } else if (boxA[i].compareTo(boxB[i]) < 0) {
                b++;
            }
        }
        if (a == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (b == 3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}

