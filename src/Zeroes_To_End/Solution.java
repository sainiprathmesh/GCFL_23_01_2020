package Zeroes_To_End;

import java.util.Scanner;

public class Solution {
    static void Arrangement(int[] a) {
        int[] n = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                n[i] = a[i];
            }
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = scanner.nextInt();
        }
        Arrangement(a);
    }
}
