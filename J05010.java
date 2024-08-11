/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
class Mathang implements Comparable<Mathang>{
    public static int num = 1;
    private String ten , nhom ;
    private float mua , ban , loinhuan;
    private int id;

    public Mathang() {
    }

    public Mathang(String ten, String nhom, float mua, float ban) {
        this.id = num++;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = ban - mua;
    }
    public Float getLoinhuan(){
        return loinhuan;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + nhom + " " + String.format("%.2f", loinhuan);
    }
    
    @Override
    public int compareTo(Mathang o){
        return o.getLoinhuan().compareTo(this.getLoinhuan());
    }
    
    
}
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Mathang> list = new ArrayList<>();
        while(t -- > 0){
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            float mua = Float.parseFloat(sc.nextLine());
            float ban = Float.parseFloat(sc.nextLine());
            Mathang mh = new Mathang(ten, nhom, mua, ban);
            list.add(mh);
        }
        Collections.sort(list);
        for (Mathang i : list) {
            System.out.println(i);
            
        }
    }
}
