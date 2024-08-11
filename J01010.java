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
public class J01010 {
    public static Scanner sc = new Scanner(System.in);
    public static long check(String s){
        long c = 0;
        for(int i = 0 ; i <s.length() ; i++){
            if(s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0'){
                c = c*10;
            }else if(s.charAt(i) == '1'){
                c = c*10+1;
            }else {
                return 0;
            }
        }
        return c;
        
    }
    public static void Test(){
        String s = sc.next();
        long res = check(s);
        if(res == 0){
            System.out.println("INVALID");
        }else 
            System.out.println(res);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t -- > 0){
            Test();
        }
        
        
            
            
        
    }
}
