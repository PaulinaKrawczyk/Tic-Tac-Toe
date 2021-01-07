import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(" ");
        Boolean compare = true;
        for (int i = 1; i < list.length; i++) {
            compare = list[i - 1].compareTo(list[i]) <= 0;
        }
//        for (int i = 1; i < list.length; i++) {
//            if (list[i - 1].compareTo(list[i]) <= 0) {
//                compare = true;
//            } else {
//                compare = false;
//            }
//        }
        System.out.println(compare);
    }
}