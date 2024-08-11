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
public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
//            TreeSet<Character> a = new TreeSet<>();
//            TreeSet<Character> b = new TreeSet<>();
            int max = Math.max(s1.length(), s2.length());
            if(s1.equals(s2)){
                System.out.println("-1");
            }else{
                System.out.println(max);
            }
            
            
           
        }
    }
}
