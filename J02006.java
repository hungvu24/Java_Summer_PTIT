/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Admin
 */
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0 ; i < n ; i++){
            tree.add(sc.nextInt());
        }
        for (int i = 0 ; i < m ; i++){
            tree.add(sc.nextInt());
        }
        for (int i : tree){
            System.out.print(i + " ");
        }
    }
}
