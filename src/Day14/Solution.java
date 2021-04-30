package Day14;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */

class Difference {
    private final int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    // Add your code here
    public static int getMin(int[] arr, int n) {
        int res = arr[0];

        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }

    public static int getMax(int[] arr, int n) {
        int res = arr[0];

        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
        return res;
    }

    public void computeDifference() {
        this.maximumDifference = getMax(this.elements, this.elements.length) - getMin(this.elements, this.elements.length);

        /*int max = Arrays.stream(elements).max().getAsInt();
        int min = Arrays.stream(elements).min().getAsInt();
        maximumDifference = max - min ;*/
    }

} // End of Difference class

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}