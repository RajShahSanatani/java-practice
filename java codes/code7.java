import java.util.*;

public class code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ✅ added semicolon

        int rows = 3;
        int cols = 3;
        int[][] arr = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " "); // ✅ use print
            }
            System.out.println(); // ✅ new line after each row
        }

        sc.close();
    }
}
