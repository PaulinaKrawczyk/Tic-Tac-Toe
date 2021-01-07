import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[size];
        System.arraycopy(a, 0, b, 0, size);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b)); 
    
    }
}
