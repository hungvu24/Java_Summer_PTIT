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
public class J03008 {
    public static boolean check1(String s ){
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean check2(String s){
        for(int i = 0 ; i < s.length() ; i ++){
            if(!isPrime(s.charAt(i)-'0')){
                return false;
            }
        }
        return true;
    }
    public static boolean test(String s){
        return check1(s) && check2(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            String s = sc.next();
            if(test(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
