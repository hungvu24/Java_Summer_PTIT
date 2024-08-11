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
public class J01011 {
    public static long gcd(long a , long b){
        while(b!=0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long lcm(long a , long b , long gcd){
        return Math.abs(a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long usc = gcd(a, b);
            long bsc = lcm(a, b, usc);
            System.out.println(bsc+" "+usc);
            
        }
    }
}
