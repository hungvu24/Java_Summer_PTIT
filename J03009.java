/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author Admin
 */
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String []a = sc.nextLine().split("\\s+");
            String b = sc.nextLine();
            TreeSet<String> dd = new TreeSet<>();
            for(String i : a){
                if(!b.contains(i)){
                    dd.add(i);
                }
            }
            for(String i : dd){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
