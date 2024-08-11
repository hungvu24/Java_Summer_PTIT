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
public class J02106 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
            int n = sc.nextInt();
            byte [][]a = new byte[n][3];
            int res = 0;
            for(int i = 0 ; i < n ; i++){
                byte dem = 0;
                for(int j = 0; j < 3 ; j++){
                    a[i][j] = sc.nextByte();
                    dem += a[i][j];
                }
                if (dem >= 2){
                    res ++;
                }
            }
            System.out.println(res);
        }
    }

