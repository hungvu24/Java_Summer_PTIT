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
class Tienluong{
    private String ten, role , id;
    private int luongngay , ngaycong , luongthang , thuong , phucap , thunhap;
    public static int num = 1;
    

    public Tienluong() {
    }

    public Tienluong(String ten, int luongngay, int ngaycong,String role) {
        this.id = "NV" + String.format("%02d", id);
        this.ten = ten;
        this.role = role;
        this.luongngay = luongngay;
        this.ngaycong = ngaycong;
        this.luongthang = luongngay * ngaycong;
        
        switch(role){
            case "GD" :
                this.phucap = 250000;
                break;
            case "PGD" :
                this.phucap = 200000;
                break;
            case "TP" :
                this.phucap = 180000;
                break;
            case "NV" : 
                this.phucap = 150000;
                break;
        }
        if(ngaycong >= 25){
            this.thuong = (int)(luongthang * 0.2f);
        }else if(ngaycong >= 22 && ngaycong <25){
            this.thuong = (int)(luongthang * 0.1f);
        }else
            this.thuong = 0;
        
        
        
    }
    public int getIncome(){
        return this.thunhap = luongthang + thuong + phucap;
        
    }
    
    
    
   
    
    @Override
    public String toString(){
        return id + " " + ten + " " + luongngay + " " + thuong + " " + phucap + " " + thunhap;
    }
}
public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tienluong> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ten  = sc.nextLine();
            int luongngay = Integer.parseInt(sc.nextLine());
            int ngaycong = Integer.parseInt(sc.nextLine());
            String chucvu = sc.nextLine();
            Tienluong tl = new Tienluong(ten, luongngay, ngaycong,chucvu);
            list.add(tl);
        }
        long sum = 0;
        for (Tienluong i : list) {
            System.out.println(i);
            //sum += list.get(i).getIncome();
            
        }
        
    }
}
