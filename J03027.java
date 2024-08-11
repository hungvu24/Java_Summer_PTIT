/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class J03027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!st.empty() && st.peek() == c) {

                st.pop();
            } else {
                st.push(c);
            }
        }

        String res = "";
        while (!st.empty()) {
            res = st.peek() + res;
            st.pop();
        }
        if (res.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(res);
            System.out.println(res.length());
        }

    }
}
