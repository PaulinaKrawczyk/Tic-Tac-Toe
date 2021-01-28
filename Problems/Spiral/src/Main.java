import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] spiralMatrix = new int[a][a];

        int rows = spiralMatrix.length;
        int cols = spiralMatrix[0].length;

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int direction = 1;
        int currNumb = 1;

        while (top <= bottom && left <= right) {
            if (direction == 1) {    //  left->right
                for (int i = left; i <= right; ++i) {
                    spiralMatrix[top][i] = currNumb++;
                }
                top++;
                direction = 2;

            } else if (direction == 2) {     //  top->bottom
                for (int i = top; i <= bottom; ++i) {
                    spiralMatrix[i][right] = currNumb++;
                }
                right--;
                direction = 3;

            } else if (direction == 3) {     //  right->left
                for (int i = right; i >= left; --i) {
                    spiralMatrix[bottom][i] = currNumb++;
                }
                bottom--;
                direction = 4;

            } else {     //  bottom->up
                for (int i = bottom; i >= top; --i) {
                    spiralMatrix[i][left] = currNumb++;
                }
                left++;
                direction = 1;
            }
        }

        for (int j = 0; j < a; j++) {
            for (int k = 0; k < a; k++) {
                System.out.print(spiralMatrix[j][k] + " ");
            }
            System.out.println();
        }

    }
}