package Pendulum_Arrangment;

import java.util.Arrays;

public class Solution {
    static void Arrangement(int[] a) {
        Arrays.sort(a);
        int op[] = new int[a.length];
        int mid = (a.length - 1) / 2;
        int j = 1, i = 1;
        op[mid] = a[0];
        for (i = 1; i <= mid; i++) {
            op[mid + i] = a[j++];
            op[mid - i] = a[j++];
        }
        if (a.length % 2 == 0)
            op[mid + i] = a[j];

        System.out.println("Pendulum arrangement:");
        for (i = 0; i < a.length; i++)
            System.out.print(op[i] + " ");
        System.out.println();
    }
}
