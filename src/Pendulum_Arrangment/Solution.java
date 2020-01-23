package Pendulum_Arrangment;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static void Arrangement(int[] arr, int n) {
        Arrays.sort(arr);
        int[] op = new int[n];
        int mid = (n - 1) / 2;
        int j = 1, i = 1;
        op[mid] = arr[0];
        for (i = 1; i <= mid; i++) {
            op[mid + i] = arr[j + 1];
            op[mid - i] = arr[j + 1];
        }
        if (n % 2 == 0)
            op[mid + i] = arr[j];
        for (i = 0; i < n; i++)
            System.out.print(op[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for (int i = 0; i < test; i++) {
            int len = scanner.nextInt();
            int[] arr = new int[len];
            for (int i1 = 0; i1 < len; i1++) {
                arr[i1] = scanner.nextInt();
            }
            Arrangement(arr, arr.length);
        }
    }
}


