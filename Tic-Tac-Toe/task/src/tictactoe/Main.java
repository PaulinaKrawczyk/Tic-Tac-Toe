package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char[] array = string.toCharArray();
       System.out.println("---------");
        for (int i = 0; i < string.length(); i++)
        {
            if (i % 3 == 0) {
                System.out.print("| " + array[i] + " ");
            }
            else if (i % 3 == 1) {
                System.out.print(array[i]);
            }
            else  System.out.println(" " + array[i] + " |");
        }
        System.out.println("");


    }
}

