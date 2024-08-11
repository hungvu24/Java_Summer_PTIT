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
class MaSV implements Comparable<MaSV>{
    private String id , ten , lop , email;

    public MaSV() {
    }

    public MaSV(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public int compareTo(MaSV o){
        return this.id.compareTo(o.id);
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + email;
    }
}
public class J05021 {
    public static void main(String[] args) {
        List<MaSV> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            list.add(new MaSV(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(list);
        for (MaSV i : list) {
            System.out.println(i);
            
        }
    }
}
