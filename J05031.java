/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Admin
 */
class Bangdiem2 implements Comparable<Bangdiem2>{
    private String ma , ten , lop;
    private float p1 , p2 , p3;

    public Bangdiem2() {
    }

    public Bangdiem2(String ma, String ten, String lop,float p1, float p2, float p3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getP3() {
        return p3;
    }

    public void setP3(float p3) {
        this.p3 = p3;
    }
    @Override
    public int compareTo(Bangdiem2 o){
        return this.ten.compareTo(o.ten);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + String.format("%.1f", p1) + " " + String.format("%.1f", p2) + " " + String.format("%.1f", p3);
    }
    
}
public class J05031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Bangdiem2> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            
            float p1 = Float.parseFloat(sc.nextLine());
            float p2 = Float.parseFloat(sc.nextLine());
            float p3 = Float.parseFloat(sc.nextLine());
            Bangdiem2 sv = new Bangdiem2(ma, ten, lop, p1, p2, p3);
            list.add(sv);
        }
        Collections.sort(list);
        int stt = 1;
        for (Bangdiem2 i : list) {
            System.out.println(stt + " " + i);
            stt++;
            
        }
    }
}
