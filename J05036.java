/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
class Giaban{
    private String ten , donvi , id;
    public static int num = 1;
    private double gianhap , soluong , phivanchuyen, thanhtien , giaban;

    public Giaban() {
    }

    public Giaban(String ten, String donvi, double gianhap, double soluong) {
        this.id = "MH" + String.format("%02d", num++);
        this.ten = ten;
        this.donvi = donvi;
        this.gianhap = gianhap;
        this.soluong = soluong;
        this.phivanchuyen = Math.round((gianhap * soluong) * 0.05);
        this.thanhtien = Math.round(gianhap * soluong + phivanchuyen);
        this.giaban = Math.round(thanhtien*102/100);
        
        
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + donvi + " " +String.format("%.0f", phivanchuyen) + " " + String.format("%.0f", thanhtien) + " " + String.format("%.0f", giaban);
    }
    
    
}
public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Giaban> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            double gianhap = Double.parseDouble(sc.nextLine());
            double soluong = Double.parseDouble(sc.nextLine());
            Giaban gb = new Giaban(ten, donvi, gianhap, soluong);
            list.add(gb);
        }
        for (Giaban i : list) {
            System.out.println(i);
            
        }
        
    }
}
