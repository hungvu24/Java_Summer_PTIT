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
public class J01007 {
     public static boolean SoCP(int n ){
        if(n < 0)
            return false;
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }
    public static boolean fibo(int n){
        return SoCP(5 * n * n + 4) || SoCP(5 * n * n -4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int n = sc.nextInt();
            if(fibo(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
