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
public class J01012 {
    public static long check(long n ){
        int dem = 0;
        for(int i = 1 ; i*i <= n ; i++){
            if (n % i == 0){
                long j = n / i;
                if(j == i){
                    dem --;
                }
                dem += 2;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int dem = 0;
            while(n%2==0){
                n/=2;
                dem ++;
                
            }
            System.out.println(dem*check(n));
        }
    }
}
