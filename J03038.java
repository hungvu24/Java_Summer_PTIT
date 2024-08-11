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
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        TreeSet<Character> a = new TreeSet<>();
        for(char c : s.toCharArray()){
            a.add(c);
            
            }
        System.out.println(a.size());
        }
        
    }

