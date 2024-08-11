/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
class Sinhvien{
    private String msv = "B20DCCN001";
    private String name;
    private String date;
    private String lop;
    private float point;

    public Sinhvien() {
    }

    public Sinhvien(String name, String date, String lop, float point) {
        this.name = name;
        this.date = date;
        this.lop = lop;
        this.point = point;
    }
    private String format(){
        try{
            SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
            Date dob = d.parse(date);
            return d.format(dob);
        }catch(ParseException e){
            System.out.println(e);
            
        }
        return "";
    }
    @Override
    public String toString(){
        return msv + " " + name + " " + lop + " " + format() + " " + String.format("%.2f", point);
    }
    
}
public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String date = sc.nextLine();
        float gpa = sc.nextFloat();
        
        Sinhvien sv = new Sinhvien(name, date, lop, gpa);
        System.out.println(sv);
    }
}
