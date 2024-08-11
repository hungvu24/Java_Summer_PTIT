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
class Tongphanso {

    private long tu, mau;

    public Tongphanso() {
    }

    public Tongphanso(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long x, long y) {
        while (y != 0) {
            long z = x % y;
            x = y;
            y = z;
        }
        return x;
    }
    @Override
    public String toString(){
        long g = gcd(this.tu, this.mau);
        return tu/g + "/" + mau/g;
    }

}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        Tongphanso p = new Tongphanso(a * d + b * c , b * d);
        System.out.println(p);
    }
}
