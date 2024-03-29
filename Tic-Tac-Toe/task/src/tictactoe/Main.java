package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter cells:");
//		String string = scanner.next();
//		char[] array = string.toCharArray();

		int sumX = 0;
		int sumO = 0;
		int sumLeftRight;
		int sumTopDown;
		int sumDiag;
		int sumSecondDiagonal;
		boolean winX = false;
		boolean winO = false;
		int first = 0;
		int second = 0;
		char[][] arr = new char[3][3];
		int[][] asciiArray = new int[3][3];
		int move = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = '_';
				asciiArray[i][j] = 95;
			}
		}

		System.out.println("---------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("|");
		}
		System.out.println("---------");

//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				asciiArray[i][j] = array[i * 3 + j];
//				arr[i][j] = array[i * 3 + j];
//
//			}
//		}
		do {
			System.out.println("Enter the coordinates:");
			try {
				first = scanner.nextInt();
				second = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("You should enter numbers!");
				scanner.nextLine();
				continue;
			}

			if (first > 0 && first < 4 && second > 0 && second < 4) {
				if (arr[first - 1][second - 1] == '_') {
					move++;
					if (move % 2 == 1) {
						arr[first - 1][second - 1] = 'X';
						asciiArray[first - 1][second - 1] = 88;
						sumX++;
					} else {
						arr[first - 1][second - 1] = 'O';
						asciiArray[first - 1][second - 1] = 79;
						sumO++;
					}
					System.out.println("---------");
					for (int i = 0; i < 3; i++) {
						System.out.print("| ");
						for (int j = 0; j < 3; j++) {
							System.out.print(arr[i][j] + " ");
						}
						System.out.println("|");
					}
					System.out.println("---------");

				} else {
					System.out.println("This cell is occupied! Choose another one!");
				}
			} else {
				System.out.println("Coordinates should be from 1 to 3!");
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
//			if (winO && winX || Math.abs(sumX - sumO) > 1) {
//				System.out.println("Impossible");
//			} else
			if (winX) {
				System.out.println("X wins");
				return;
			} else if (winO) {
				System.out.println("O wins");
				return;
			} else if (sumX + sumO == 9) {
				System.out.println("Draw");
				break;
			}
//			else
//				System.out.println("Game not finished");

		} while (true);
	}
}

