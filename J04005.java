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
class Thisinh{
    private String name ; 
    private String date;
    private float p1 , p2 , p3;

    public Thisinh() {
    }

    public Thisinh(String name, String date, float p1, float p2, float p3) {
        this.name = name;
        this.date = date;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    private float tong(){
        return p1 + p2 + p3;
    }
    @Override
    public String toString(){
        return name + " " + date + " " + String.format("%.1f", tong());
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        float p1 = sc.nextFloat();
        float p2 = sc.nextFloat();
        float p3 = sc.nextFloat();
        
        Thisinh ts = new Thisinh(name , date , p1 , p2 , p3);
        System.out.println(ts);
    }
    
}
