package Pendulum_Arrangment;

import java.util.Arrays;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int len = scanner.nextInt();
            int[] arr = new int[len];
            for (int i1 = 0; i1 < len; i1++) {
                arr[i] = scanner.nextInt();
            }
            Arrangement(arr);
        }
    }
}


