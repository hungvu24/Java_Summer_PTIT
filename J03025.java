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
public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            String s = sc.next();
            int cnt = 0;
            for(int i = 0 ; i < s.length()/2 ; i++){
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    cnt++;
                }
            }
            if((s.length() % 2 == 0 && cnt == 1) || (s.length() % 2 == 1 && cnt <= 1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
