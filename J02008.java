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
public class J02008 {
    public static Scanner sc = new Scanner(System.in);
    public static long gcd(long a , long b){
        while(b!=0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
        
    }
    public static long lcm(long a , long b ){
        return a*b/gcd(a, b);
    }
    public static void test(){
        long n = sc.nextLong();
        long res = 1;
        for(int i = 2 ; i <= n ; i++){
            res = lcm(res, i);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t -- > 0){
            test();
        }
    }
    
}
