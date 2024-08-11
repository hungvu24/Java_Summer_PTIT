/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        int res =0;
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            if(a.isEmpty()){
                a.add(x);
                res++;
            }else if((a.get(res - 1) + x) % 2 == 0){
                a.remove(res -1);
                res--;
            }else{
                a.add(x);
                res++;
            }
        }
        System.out.println(a.size());
        
        
    }
}
