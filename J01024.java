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
public class J01024 {
    public static boolean test(String s){
        for(int i = 0 ; i < s.length() ; i++){
            if( s.charAt(i) > '2'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            String s = sc.next();
            if(test(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
