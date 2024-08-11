/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class J02016 {
    public static boolean check(long []a){
        for(int i = 0 ; i < a.length ; i++){
            a[i] = a[i] * a[i];
            
        }
        Arrays.sort(a);
        for(int i = a.length - 1 ; i >= 2 ; i--){
            int left = 0;
            int right = i-1;
            while(left < right){
                if(a[left] + a[right] == a[i]){
                    return true;
                }else if(a[left] + a[right] < a[i]){
                    left++;
                }else{
                    right++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int n = sc.nextInt();
            long []a = new long[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextLong();
            }
            if(check(a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    
}
}