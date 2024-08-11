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
class Giaovien {

    private String name, ma;
    private long luong, heso, phucap;

    public Giaovien() {
    }

    public Giaovien(String name, String ma, long luong) {
        this.ma = ma;
        this.name = name;
        this.luong = luong;
        heso = Integer.parseInt(ma.substring(2));
    }
    
    private long extra(){
        if(ma.substring(0, 2).equals("HT")){
            phucap = 2000000;
        }else if(ma.substring(0, 2).equals("HP")){
            phucap = 900000;
        }else{
            phucap = 500000;
        }
        return phucap;
    }
    private long thunhap(){
        return luong*heso+phucap;
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + heso + " " + extra() + " " + thunhap();
    }

}

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        long luong = sc.nextLong();
        Giaovien gv = new Giaovien(name, ma, luong);
        System.out.println(gv);
    }
}
