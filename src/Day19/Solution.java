package Day19;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        /*int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }*/

        int[] temp = new int[n];
        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                temp[counter] = i;
            }
            counter++;
        }

        for (int value : temp) {
            sum += value;
        }

        return sum;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}