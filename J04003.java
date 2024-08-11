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
class Phanso{
    private long tu , mau;

    public Phanso() {
    }

    public Phanso(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    private long gcd(long x , long y){
        while(y != 0){
            long z = x % y;
            x = y ;
            y = z ;
        }
        return x;
    }
    @Override
    public String toString(){
        long g = gcd(this.tu, this.mau);
        return tu/g +"/"+mau/g;
    }
}
public class J04003 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        long tu = SC.nextLong();
        long mau = SC.nextLong();
        Phanso p = new Phanso(tu , mau);
        System.out.println(p);
    }
}
