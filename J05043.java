/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.*;

/**
 *
 * @author Admin
 */
class Thunhap{
    static int num = 1;
    private String ten , role , id;
    private double luong , ngay , phucap , tamung , salary , price , hieu;

    public Thunhap() {
    }

    public Thunhap(String ten, String role, double luong, double ngay) {
        this.id = "NV" + String.format("%02d", num++);
        this.ten = ten;
        this.role = role;
        this.luong = luong;
        this.ngay = ngay;
        this.salary = luong*ngay;
        
        if(this.role.equals("GD")){
            this.phucap = 500;
        }else if(this.role.equals("PGD")){
            this.phucap = 400;
        }else if(this.role.equals("TP")){
            this.phucap = 300;
        }else if(this.role.equals("KT")){
            this.phucap = 250;
        }else {
            this.phucap = 100;
        }
        
        this.price = (phucap + salary)*2/3;
        
        if(this.price < 25000){
            this.tamung = Math.round((this.phucap + this.salary)*2/3/1000)*1000;
        }else {
            this.tamung = 25000;
        }
        
        this.hieu = this.salary + this.phucap - this.tamung;
                
    }
    @Override
    public String toString(){
        return this.id + " " + this.ten + " " + String.format("%.0f", this.phucap) + " " + String.format("%.0f", this.salary) + " " + String.format("%.0f", this.tamung) + " " + String.format("%.0f", this.hieu);
    }
    
}
public class J05043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Thunhap> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ten = sc.nextLine();
            String role = sc.nextLine();
            double luong = Double.parseDouble(sc.nextLine());
            double ngay = Double.parseDouble(sc.nextLine());
            Thunhap tn = new Thunhap(ten, role, luong, ngay);
            list.add(tn);
        }
        for (Thunhap i : list) {
            System.out.println(i);
            
        }
    }
}
