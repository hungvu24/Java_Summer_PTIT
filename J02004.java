/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02004 {

    public static boolean doixung(int a[], int n) {
        for (int i = 0; i <= n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            if (doixung(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
