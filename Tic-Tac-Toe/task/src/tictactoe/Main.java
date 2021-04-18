package tictactoe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter cells:");
		String string = scanner.next();
		char[] array = string.toCharArray();

		int sumX = 0;
		int sumO = 0;
		int sumLeftRight;
		int sumTopDown;
		int sumDiag;
		int sumSecondDiagonal;
		boolean winX = false;
		boolean winO = false;

		System.out.println("---------");
		for (int i = 0; i < string.length(); i++) {
			if (i % 3 == 0) {
				System.out.print("| " + array[i] + " ");
			} else if (i % 3 == 1) {
				System.out.print(array[i]);
			} else System.out.println(" " + array[i] + " |");
		}
		System.out.println("---------");
		int[][] asciiArray = new int[3][3];

		for (char c : array) {
			if (c == 'X') {
				sumX++;
			} else if (c == 'O') {
				sumO++;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				asciiArray[i][j] = array[i * 3 + j];
			}
		}

		for (int i = 0; i < 3; i++) {
			sumLeftRight = asciiArray[i][0] + asciiArray[i][1] + asciiArray[i][2];
			sumTopDown = asciiArray[0][i] + asciiArray[1][i] + asciiArray[2][i];
			sumDiag = asciiArray[0][0] + asciiArray[1][1] + asciiArray[2][2];
			sumSecondDiagonal = asciiArray[2][0] + asciiArray[1][1] + asciiArray[0][2];

			if (sumLeftRight == 264 || sumTopDown == 264 || sumDiag == 264 || sumSecondDiagonal == 264) {
				winX = true;
			} else if (sumLeftRight == 237 || sumTopDown == 237 || sumDiag == 237 || sumSecondDiagonal == 237) {
				winO = true;
			}
		}
		if (winO && winX || Math.abs(sumX - sumO) > 1) {
			System.out.println("Impossible");
		} else if (winX) {
			System.out.println("X wins");
		} else if (winO) {
			System.out.println("O wins");
		} else if (sumX + sumO == 9) {
			System.out.println("Draw");
		} else
			System.out.println("Game not finished");
	}

}

