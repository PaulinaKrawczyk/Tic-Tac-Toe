import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        String line = scanner.nextLine();
        while (!line.startsWith("end")) {
            input.append(line).append("\n");
            line = scanner.nextLine();
        }
        String[] wholeString = input.toString().split("\n");
        int[][] matrix = new int[wholeString.length][wholeString[0].split(" ").length];
        for (int i = 0; i < matrix.length; i++) {
            String[] stringLine = wholeString[i].split(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(stringLine[j]);
            }
        }
        int row = matrix.length;
        int col = matrix[0].length;

//
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int newMatrix = matrix[(row + i - 1) % row][j] +
                        matrix[(row + i + 1) % row][j] +
                        matrix[i][(col + j - 1) % col] +
                        matrix[i][(col + j + 1) % col];
                System.out.print(newMatrix + " ");
            }
            System.out.println();
        }
    }
}



