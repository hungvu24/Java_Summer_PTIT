/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author Admin
 */
public class J02005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        HashSet<Integer> dd = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dd.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            
        }
        for(int i : b){
            if(dd.contains(i)){
                System.out.print(i+ " ");
            }
        }
        }
        
    }
    

