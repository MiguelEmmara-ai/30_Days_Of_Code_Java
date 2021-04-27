package Day11;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = findSum(arr, row, col);
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
        scanner.close();
    }

    private static int findSum(int[][] arr, int row, int col) {
        return arr[row][col]
                + arr[row][col + 1]
                + arr[row][col + 2]
                + arr[row + 1][col + 1]
                + arr[row + 2][col]
                + arr[row + 2][col + 1]
                + arr[row + 2][col + 2];
    }
}