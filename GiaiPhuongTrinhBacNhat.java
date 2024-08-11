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
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double dv = -b/a;
        if(a == 0 && b == 0){
            System.out.println("VSN");
        }
        if(a == 0 && b != 0){
            System.out.println("VN");
        }
        if(a != 0 && b != 0){
            System.out.printf("%.2f",dv);
            
        }
        System.out.println();
    }
}
