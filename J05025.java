/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
class Giangvien implements Comparable<Giangvien>{
    private String ten , mon , id;
    public static int num = 1;

    public Giangvien() {
    }

    public Giangvien(String ten, String mon) {
        this.id = "GV" + String.format("%02d", num++);
        this.ten = ten;
        this.mon = mon;
        
        
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Giangvien.num = num;
    }
    
    public String format(){
        String []a = mon.split(" ");
        String res = "";
        for (String i : a) {
            res += Character.toUpperCase(i.charAt(0));
            
        }
        return res;
    }
    public String getName(){
        String []a = ten.split(" ");
        String rs = "";
        for (String i : a) {
            rs += a[a.length - 1];
            
        }
        return rs;
    }
    @Override
    public int compareTo(Giangvien o){
        if(this.getName().compareTo(o.getName()) == 0){
            return this.id.compareTo(o.id);
        }
        return this.getName().compareTo(o.getName());
            
        
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + format();
    }
    
}
public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Giangvien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            list.add(new Giangvien(sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(list);
        for (Giangvien i : list) {
            System.out.println(i);
            
        }
    }
}
