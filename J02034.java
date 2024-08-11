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
public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int []dd = new int[10003];
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
            dd[a[i]] = 1;
        }
        boolean check = true;
        for(int i = 1 ; i <= max ; i++){
            if(dd[i] == 0){
                System.out.println(i);
                check = false;
            }
            
        }
        if(check){
            System.out.println("Excellent!");
        }
        
    }
}
