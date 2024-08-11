/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
class Product implements Comparable<Product>{
    public static int num = 1;
    private String ten , donvi,id;
    private int sell , buy , loinhuan;

    public Product() {
    }

    public Product(String ten, String donvi, int sell, int buy) {
        this.id = "MH" + String.format("%03d", num++);
        this.ten = ten;
        this.donvi = donvi;
        this.buy = buy;
        this.sell = sell;
        loinhuan = sell - buy;
    }
    public int getProfit(){
        return loinhuan;
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + donvi + " " + buy + " " + sell + " " +loinhuan;
    }
    
    @Override
    public int compareTo(Product o){
        return o.getProfit() - this.getProfit();
    }
  
    
}
public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int buy = Integer.parseInt(sc.nextLine());
            int sell = Integer.parseInt(sc.nextLine());
            Product p = new Product(ten, donvi, sell, buy);
            list.add(p);
        }
        Collections.sort(list);
        for(Product i : list){
            System.out.println(i);
        }
    }
}
