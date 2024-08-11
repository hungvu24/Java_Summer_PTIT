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
class SinhVien implements Comparable<SinhVien>{
    private String id , ten , lop , email;

    public SinhVien() {
    }

    public SinhVien(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public int compareTo(SinhVien o){
        if(this.lop.compareTo(o.lop) == 0){
            return this.id.compareTo(o.id);
        }
        return this.lop.compareTo(o.lop);
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + email;
    }
    
}
public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sv = new SinhVien(ma, ten, lop, email);
            list.add(sv);
        }
        Collections.sort(list);
        for (SinhVien i : list) {
            System.out.println(i);
            
        }
    }
}
