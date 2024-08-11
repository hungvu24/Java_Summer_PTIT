/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
class Tuyensinh {

    private String ma, hoten;
    private float tongdiem, diemuutien;

    public Tuyensinh() {
    }

    public Tuyensinh(String ma, String hoten, float[] diem) {
        this.ma = ma;
        this.hoten = hoten;
        this.tongdiem = diem[0] * 2 + diem[1] + diem[2];

        switch (ma.substring(0, 3)) {
            case "KV1":
                this.diemuutien = 0.5f;
                break;
            case "KV2":
                this.diemuutien = 1.f;
                break;
            case "KV3":
                this.diemuutien = 2.5f;
                return;
        }

    }

    public String formatFloat(float x) {
        int xInt = (int) (x * 10);
        return xInt % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
    }

    public String getStatus() {
        float diemchuan = 24.f;
        return tongdiem + diemuutien >= diemchuan ? "TRUNG TUYEN" : "TRUOT";
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " +formatFloat(diemuutien)+ " " + formatFloat(tongdiem) + " " + getStatus();
    }

}

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String hoten = sc.nextLine();
        float[]diem = new float[3];
        for(int i = 0 ; i < 3 ; i++){
            diem[i]=Float.parseFloat(sc.nextLine());
        }
        Tuyensinh ts = new Tuyensinh(ma, hoten, diem);
        System.out.println(ts);
    }
}
