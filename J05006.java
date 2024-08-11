/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
class NhanVien {

    public static int num = 1;
    private String ten, gioitinh, ngaysinh, diachia, mst, time, id;

    public NhanVien() {
    }

    public NhanVien(String ten, String gioitinh, String ngaysinh, String diachia, String mst, String time) {
        this.id = "000" + String.format("%02d", num++);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachia = diachia;
        this.mst = mst;
        this.time = time;
    }

    public String format() {
        try {
            SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
            Date dob = d.parse(ngaysinh);
            return d.format(dob);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    public String format1() {
        try {
            SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
            Date tgian = d.parse(time);
            return d.format(tgian);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gioitinh + " " + format() + " " + diachia + " " + mst + " " + format1();
    }

}

public class J05006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String ten = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();
            String mst = sc.nextLine();
            String time = sc.nextLine();
            NhanVien nv = new NhanVien(ten, gioitinh, ngaysinh, diachi, mst, time);
            System.out.println(nv);
        }

    }
}
