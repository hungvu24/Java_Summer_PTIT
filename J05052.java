/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Admin
 */
class Donhang {
    private String ten , ma ;
    private int gia , sl , sale , thanhtien , giagoc ;

    public Donhang() {
    }

    public Donhang(String ten, String ma, int gia, int sl) {
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.sl = sl;
        this.giagoc = gia * sl;
        
        if(ma.substring(4, 5).equals("1")){
            this.sale = (int) Math.ceil(gia * 0.5 * sl);
        }else if(ma.substring(4, 5).equals("2")){
            this.sale = (int) Math.ceil(gia * 0.3 * sl);
        }
        this.thanhtien = giagoc - sale;
    }
    public String getSTT(){
        String res = "";
        return res += this.ma.substring(1, 4);
    }
    
    @Override
    public String toString(){
        return this.ten + " " + this.ma + " " + getSTT() + " " + this.sale + " " + this.thanhtien;
    }
    
}
public class J05052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Donhang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int sl = Integer.parseInt(sc.nextLine());
            Donhang dh = new Donhang(ten, ma, gia, sl);
            list.add(dh);
        }
        for (Donhang i : list) {
            System.out.println(i);
            
        }
    }
}
