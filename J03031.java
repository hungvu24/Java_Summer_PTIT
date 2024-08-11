/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J03031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();

            TreeSet<Character> tree = new TreeSet<>();
            int cnt = 26;
            for (char i : s.toCharArray()) {
                tree.add(i);
            }
            int dodai = cnt - tree.size();
            if (dodai <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
