import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by Miguel Emmara
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        try {

            while (sc.hasNext()) {
                System.out.println(count++  + " " + sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
