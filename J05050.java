/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.lang.*;
/**
 *
 * @author Admin
 */
class Tiendien {
    public static int num = 1;
    private String loai , ma ;
    private long cu , moi , thanhtien , phutroi , tong , hieu  , hs;

    public Tiendien() {
    }

    public Tiendien(String loai, long cu, long moi) {
        this.ma = "KH" + String.format("%02d", num ++);
        this.loai = loai;
        this.cu = cu;
        this.moi = moi;
        this.hieu = moi - cu;
        
        if(this.loai.substring(0, 2).equals("KD")){
            this.hs = 3;
        }else if(this.loai.substring(0, 2).equals("NN")){
            this.hs = 5;
        }else if(this.loai.substring(0, 2).equals("TT")){
            this.hs = 4;
        }else if(this.loai.substring(0, 2).equals("CN")){
            this.hs = 2;
        }
        
        this.thanhtien = hieu * hs * 550;
        
        if(this.hieu < 50){
            this.phutroi = 0;
        }else if(this.hieu >= 50 && this.hieu <= 100){
            this.phutroi =  (int)Math.ceil(this.thanhtien*0.35);
        }else if(this.hieu > 100){
            this.phutroi = (int)Math.ceil(this.thanhtien*1);
        }
        
        this.tong = thanhtien + phutroi;
    }
    
    
    @Override
    public  String toString(){
        return this.ma + " " + this.hs + " " + this.thanhtien + " " + this.phutroi + " " + this.tong;
    }
    
}
public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tiendien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String loai = sc.nextLine();
            long cu = Long.parseLong(sc.nextLine());
            long moi = Long.parseLong(sc.nextLine());
            Tiendien td = new Tiendien(loai, cu, moi);
            list.add(td);
        }
        for (Tiendien i : list) {
            System.out.println(i);
            
        }
    }
}
