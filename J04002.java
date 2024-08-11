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
class Retangle{
    double width ;
    double height;
    String s ;

    public Retangle() {
        width = 1;
        height = 1;
    }

    public Retangle(double width, double height , String s) {
        this.width = width;
        this.height = height;
        this.s = s;
    }
    public String getColor(){
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public double cv(){
        return (width + height)*2;
    }
    public double dt(){
        return width*height;
    }
    @Override
    public String toString(){
        return String.format("%d %d %s", (int) cv() , (int) dt() , getColor());
    }
    
}
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cd = sc.nextDouble();
        double cr = sc.nextDouble();
        String color = sc.next();
        if(cd > 0 && cr > 0){
            Retangle tamgiac = new Retangle(cd , cr , color);
            System.out.println(tamgiac);
        }else {
                System.out.println("INVALID");
                }
        
    }
}
