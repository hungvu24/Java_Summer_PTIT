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
class Bangdiem implements Comparable<Bangdiem> {

    public static int num = 1;
    private String id, ten;

    public float avg;

    public Bangdiem() {
    }

    public Bangdiem(String ten, float[] a) {
        this.id = "HS" + String.format("%02d", num++);
        this.ten = ten;
        avg = 0f;

        for (int i = 0; i < 10; i++) {
            if (i < 2) {
                avg += a[i] * 2f;
            } else {
                avg += a[i] * 1f;
            }
        }
        avg /= 12f;
        avg = Math.round(avg * 10f) / 10f;
    }

    private String Xeploai() {
        if (avg >= 9f) {
            return "XUAT SAC";
        }
        if (avg >= 8f) {
            return "GIOI";
        }
        if (avg >= 7f) {
            return "KHA";
        }
        if (avg >= 5f) {
            return "TB";
        }
        return "YEU";
    }

    @Override
    public int compareTo(Bangdiem o) {
        if (this.avg != o.avg) {
            if (this.avg > o.avg) {
                return -1;
            }
            return 1;

        }else 
            return -this.id.compareTo(o.id);

    }
    @Override
    public String toString(){
        return id + " " + ten + " " + String.format("%.1f", avg) + " " + Xeploai();
    }
}
    public class J05018 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int t = Integer.parseInt(sc.nextLine());
            List<Bangdiem> list = new ArrayList<>();
            for(int i = 0 ; i < t ; i++){
                String ten = sc.nextLine();
                float []a = new float[10];
                for(int j = 0 ; j < 10 ; j++){
                    a[j]= sc.nextFloat();
                }
                Bangdiem bd = new Bangdiem(ten, a);
                list.add(bd);
            }
            Collections.sort(list);
            for (Bangdiem i : list) {
                System.out.println(i);
                
            }
        }
    }
