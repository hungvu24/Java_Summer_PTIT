/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Admin
 */
class Thuctap implements Comparable<Thuctap>{
    private String ma , ten;
    private int soluong;

    public Thuctap() {
    }

    public Thuctap(String ma, String ten, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
    }
    public int getSoluong(){
        return soluong;
    }
    @Override
    public int compareTo(Thuctap o){
        if(this.soluong != o.soluong){
            if(this.soluong > o.soluong) return -1;
            return 1;
            
        }else{
            return this.ma.compareTo(o.ma);
        }
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + (int) soluong;
    }
}
public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Thuctap> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int soluong = Integer.parseInt(sc.nextLine());
            Thuctap tt = new Thuctap(ma, ten, soluong);
            list.add(tt);
        }
        Collections.sort(list);
        for (Thuctap i : list) {
            System.out.println(i);
            
        }
    }
}
