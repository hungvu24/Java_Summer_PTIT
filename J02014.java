/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class J02014 {

    public static Scanner ip = new Scanner(System.in);

    public static void testCase() {
        int n = ip.nextInt();
        int sum = 0;
        int[] a = new int[n];
        int[] f = new int[n]; // cộng dồn
        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
            sum += a[i];
            if (i == 0) {
                f[i] = a[i];
            } else {
                f[i] = f[i - 1] + a[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (f[i - 1] == sum - f[i]) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        int T = ip.nextInt();
        while (T-- > 0) {
            testCase();
        }
    }
}