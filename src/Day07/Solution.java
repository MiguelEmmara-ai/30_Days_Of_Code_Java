package Day07;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        reverse(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    static void reverse(int[] arr, int start, int end) {
        int temp;

        if (start >= end) {
            return;
        }

        // Swap Element
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
}