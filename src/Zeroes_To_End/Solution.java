package Zeroes_To_End;

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
}