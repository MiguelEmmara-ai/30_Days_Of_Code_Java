package Day16;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int new_int;
            new_int = Integer.parseInt(S);

            System.out.println(new_int);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}