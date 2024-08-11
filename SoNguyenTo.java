/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoNguyenTo {
    public static boolean Prime(long a){
        if (a < 2){
            return false;
        }
        for(int i = 2 ; i*i <= a ; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            if(Prime(a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
}
