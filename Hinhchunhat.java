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
public class Hinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieudai = sc.nextInt();
        int chieurong = sc.nextInt();
        long cv = (chieudai + chieurong)*2;
        long dientich = chieudai * chieurong;
        if(chieudai <= 0 || chieurong <= 0){
            System.out.println("0");
        }else{
            System.out.println(cv + " " + dientich);
        }
    }
    
}
