package Solve_The_Series;

import java.util.Scanner;

public class Solution {
    static int findTerm(int n) {
        if (n == 1) {
            return n;
        } else {
            int a = 7;
            for (int i = 2; i <= n; i++) {
                a = a * 2 + (i - 1);
            }
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    }
}
