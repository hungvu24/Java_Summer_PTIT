/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author Admin
 */
class NV implements Comparable<NV>{
    public static int num = 1;
    private String ten, gioitinh , diachi ,mst , id;
    private Date ngaysinh , time;

    public NV() {
    }

    public NV(String ten, String gioitinh, String diachi, String mst, Date ngaysinh, Date time) {
        this.id = "000" + String.format("%02d", num++);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.mst = mst;
        this.ngaysinh = ngaysinh;
        this.time = time;
    }
    public String format(Date date){
        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        return d.format(date);
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + gioitinh + " " + format(ngaysinh) + " " + diachi + " " + mst + " " + format(time);
    }
    @Override
    public int compareTo(NV o){
        return this.ngaysinh.compareTo(o.ngaysinh);
    }
    
}
public class J05007 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        List<NV> list = new ArrayList<>();
        while(t -- > 0){
            String ten = sc.nextLine();
            String gioitinh = sc.nextLine();
            Date ngaysinh = d.parse(sc.nextLine());
            String diachi = sc.nextLine();
            String mst = sc.nextLine();
            Date time = d.parse(sc.nextLine());
            NV nhanvien = new NV(ten, gioitinh, diachi, mst, ngaysinh, time);
            list.add(nhanvien);
        }
        Collections.sort(list);
        for (NV i : list) {
            System.out.println(i);
            
        }
    }
}
