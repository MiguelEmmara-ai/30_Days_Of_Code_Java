package Day06;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        String s;
        n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


       /* for (int i = 0; i < n; i++) {
            s = scanner.nextLine();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(s.charAt(j));
                }
            }

            System.out.print(" ");

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 != 0) {
                    System.out.print(s.charAt(j));
                }
            }

            System.out.println();
        }*/

        for (int i = 0; i < n; i++) {
            s = scanner.nextLine();
            int length = s.length();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int j = 0; j < length; j+=2) {
                even.append(s.charAt(j));
            }

            for (int k = 1; k < length; k+=2) {
                odd.append(s.charAt(k));
            }

            System.out.println(even + " " + odd);
        }

        scanner.close();
    }
}

