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
public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String s = sc.nextLine();
            String []a = s.split(" ");
            int n = a.length;
            int chan = 0;
            int le = 0;
            for(int i = 0 ; i < n ; i++){
                if(a[i].charAt(a[i].length()-1) % 2 == 0){
                    chan++;
                }else{
                    le++;
                }
            }
            if((n % 2  == 0 && chan > le) || (n % 2 == 1 && le > chan)){
                System.out.println("YES");
            }else 
                System.out.println("NO");
        }
    }
}
