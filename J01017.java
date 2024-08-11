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
public class J01017 {

    public static boolean check(String s) {
        for (int i = 1; i < s.length(); i++) {
            int a = s.charAt(i);
            int b = s.charAt(i - 1);

            if (Math.abs(a - b) != 2) {
                return false;
            }

        }
        int sum = 0;
        for (int i = 0; i <s.length() ;i++ ){
            sum += s.charAt(i) - '0';
        }
        if(sum % 10 != 0){
            return false;
        } 
        return true;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
