/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;

import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

/**
 *
 * @author Admin
 */
public class J02027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int cnt = 0;
            BigInteger[] a = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextBigInteger();
            }
            BigInteger k = sc.nextBigInteger();
            Arrays.sort(a);

            int left = 0;
            int right = n - 1;
            while (left < right) {
                if (a[right].subtract(a[left]).equals(k)) {
                    cnt++;
                } else if (a[right].subtract(a[left]).compareTo(k) < 0) {
                    left++;
                } else {
                    right--;
                }
            }

            System.out.println(cnt);

        }
    }
}
