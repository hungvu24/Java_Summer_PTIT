/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Admin
 */
class Nhanvien{
    private String ma = "00001";
    private String name;
    private String gender;
    private String date;
    private String address;
    private String code;
    private String time;

    public Nhanvien() {
    }

    public Nhanvien(String name, String gender, String date, String address, String code, String time) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.code = code;
        this.time = time;
    }
    private String format1(){
        try{
            SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
            Date dob = d.parse(date);
            return d.format(dob);
        }catch(ParseException e){
            System.out.println(e);
        }
        return "";
    }
    private String format2(){
        try{
            SimpleDateFormat st = new SimpleDateFormat("dd/mm/yyyy");
            Date t = st.parse(time);
            return st.format(t);
        }catch(ParseException e){
            System.out.println(e);
        }
        return "";
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + gender + " " + format1() + " " + address + " " + code + " " + format2() ;
    }
    
    
}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String date = sc.nextLine();
        String address = sc.nextLine();
        String code = sc.nextLine();
        String time = sc.nextLine();
        Nhanvien nv = new Nhanvien(name, gender, date, address, code, time);
        System.out.println(nv);
    }
}
