import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String list = scanner.nextLine();
        String[] a = list.split(" ");
        int n = scanner.nextInt();
        int rotation = n % a.length;
        for (int j = 0; j < rotation; j++) {
            String last = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = last;
        }
        for (String s : a) {
            System.out.print(s + " ");
        }
    }
}
