/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
/**
 *
 * @author Admin
 */
class Sinhvien3 implements Comparable<Sinhvien3>{
    public static int num = 1;
    private String ten , lop , ngaysinh , id;
    float gpa;

    public Sinhvien3() {
    }

    public Sinhvien3(String ten, String lop, String ngaysinh, float gpa) {
        this.id = "B20DCCN" + String.format("%03d", num++);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        
        this.gpa = gpa;
        
    }
    public String format(){
        try{
            SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
            Date dob = d.parse(ngaysinh);
            return d.format(dob);
        }catch(ParseException e){
            System.out.println(e);
        }
        return "";
    }
    public String chuanhoa(){
        ten = ten.trim().toLowerCase();
        String [] a = ten.split("\\s+");
        String res = "";
        for (String i : a) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
            
        }
        return res;
    }
    public Float getGPA(){
        return gpa;
    }
    @Override
    public int compareTo(Sinhvien3 o){
        return -(this.getGPA().compareTo(o.getGPA()));
    }
    @Override
    public String toString(){
        return id + " " + chuanhoa() + " " + lop + " " + format() + " " + String.format("%.2f", gpa);
    }
    
}
public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Sinhvien3> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String date = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            Sinhvien3 sv3 = new Sinhvien3(ten, lop, date, gpa);
            list.add(sv3);
        }
        Collections.sort(list);
        for(Sinhvien3 i : list){
            System.out.println(i);
        }
    }
}
