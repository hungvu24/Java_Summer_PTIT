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
class Tinhcong{
    private String name , ma;
    private int thunhap , thuong , phucap;

    public Tinhcong() {
    }

    public Tinhcong(String name, int luong, int songay, String role) {
        
        this.ma = "NV01";
        this.name = name;
        this.thunhap = luong*songay;
        if(songay >= 25){
            this.thuong = (int)(thunhap * 0.2f);
        }else if(songay >= 22 && songay < 25){
            this.thuong = (int)(thunhap *0.1f);
        }else{
            this.thuong = 0;
        }
        switch(role){
            case "GD" :
                phucap = 250000;
                break;
            case "PGD" :
                phucap = 200000;
                break;
            case "TP" :
                phucap = 180000;
                break;
            case "NV" :
                phucap = 150000;
                break;
        }
        
                  
        
    }
    public int getIncome(){
        return thunhap+thuong+phucap;
    }
    
    @Override
    public String toString(){
        return ma + " " + name + " " + thunhap + " " + thuong + " " + phucap + " " + getIncome();
    }
    
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int luong = Integer.parseInt(sc.nextLine());
        int songay = Integer.parseInt(sc.nextLine());
        String role = sc.nextLine();
        Tinhcong tc = new Tinhcong(name, luong, songay, role);
        System.out.println(tc);
    }
}
