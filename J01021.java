/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Admin
 */
public class J01021 {
    final int mod = 1000000007;
    public static long Luythua(long a , long b , int mod){
        long res = 1;
        a = a % mod;
        while(b > 0){
            if(b % 2 == 1){
                res = (res * a ) % mod;
            }
            a = (a * a) % mod;
            b = b/2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOD = 1000000007;
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0){
                break;
            }else{
                System.out.println(Luythua(a, b, MOD));
            }
        }
        
        
    }
}
