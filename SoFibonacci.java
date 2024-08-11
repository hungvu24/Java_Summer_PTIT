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
public class SoFibonacci {
    public static void Fibo(long []fibo ){
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2 ; i <= 92 ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
                
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long []fibo = new long[93];
        Fibo(fibo);
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(fibo[n]);
            
        }
    }
}
