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
class Tinhcong {

    public static int num = 1;
    private String id, name, role;
    private int luongngay, ngay, luong, thuong, phucap ,thunhap;

    public Tinhcong() {
    }

    public Tinhcong(String name, int luongngay, int ngay ,String role) {
        this.id = "NV" + String.format("%02d", num++);
        this.name = name;
        this.role = role;
        this.luongngay = luongngay;
        this.ngay = ngay;
        this.luong = luongngay * ngay;
        if (this.ngay >= 25) {
            this.thuong = (int) (this.luong * 0.2f);

        } else if (this.ngay >= 22 && this.ngay < 25) {
            this.thuong = (int) (this.luong * 0.1f);
        } else {
            this.thuong = 0;
        }

        if (this.role.substring(0, 2).equals("GD")) {
            this.phucap = 250000;
        } else if (this.role.substring(0, 2).equals("PG")) {
            this.phucap = 200000;
        } else if (this.role.substring(0, 2).equals("TP")) {
            this.phucap = 180000;
        } else {
            this.phucap = 150000;

        }
        
        this.thunhap = luong + phucap + thuong;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.luong + " " + this.thuong + " " + this.phucap + " " + this.thunhap;
    }
}

public class J05040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Tinhcong> list = new ArrayList<>();
        while(t -- > 0){
            String name = sc.nextLine();
            int luong = Integer.parseInt(sc.nextLine());
            int ngay = Integer.parseInt(sc.nextLine());
            String role = sc.nextLine();
            Tinhcong tc = new Tinhcong(name, luong, ngay, role);
            list.add(tc);
        }
        for (Tinhcong i : list) {
            System.out.println(i);
        }
    }
}
