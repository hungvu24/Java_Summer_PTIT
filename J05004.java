/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author Admin
 */
class Sinhvien2{
    public static int  num = 1;
    private String ten , lop , ngaysinh , id;
    private float gpa;

    public Sinhvien2() {
    }

    public Sinhvien2(String ten, String lop, String ngaysinh, float gpa) {
        this.id = "B20DCCN" + String.format("%03d", num++);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gpa = gpa;
    }
    private String format(){
        try{
            SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
            Date dob = d.parse(ngaysinh);
            return d.format(dob);
        }catch(ParseException e){
            System.out.println(e);
        }
        return "";
    }
    private String chuanhoa(){
        ten = ten.trim().toLowerCase();
        String []a = ten.split("\\s+");
        String res = "";
        for (String i : a) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res;
    }
    @Override
    public String toString(){
        return id + " " + chuanhoa() + " " + lop + " " + format() + " " + String.format("%.2f", gpa);
    }
    
}
public class J05004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String date = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            Sinhvien2 sv2 = new Sinhvien2(ten, lop, date, gpa);
            System.out.println(sv2);
        }
    }
}
