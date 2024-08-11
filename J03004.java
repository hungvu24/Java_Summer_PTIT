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
public class J03004 {
    public static String chuanhoa(String s){
        s = s.trim().toLowerCase();
        String []a = s.split("\\s+");
        String res = "";
        for(String tmp : a){
            res += tmp.substring(0,1).toUpperCase() +tmp.substring(1).toLowerCase() + " ";
        }
        return res;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String s = sc.nextLine();
            System.out.println(chuanhoa(" "+s));
        }
    }
}
