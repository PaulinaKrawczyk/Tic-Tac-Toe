import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[][] cubic = new int[size][size];
		for (int j = 0; j < size; j++) {
			for (int k = 0; k < size; k++) {
				cubic[j][k] = Math.abs(j - k);
				System.out.print(cubic[j][k] + " ");
			}
			System.out.println();
		}
	}
}

