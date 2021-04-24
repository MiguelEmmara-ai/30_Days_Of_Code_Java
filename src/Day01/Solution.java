package Day01;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int secondI = scan.nextInt();
        double secondD = scan.nextDouble();
        scan.nextLine();
        String secondS = scan.nextLine();

        System.out.println((secondI + i));
        System.out.println((d + secondD));
        System.out.println((s.concat(secondS)));


        scan.close();
    }
}