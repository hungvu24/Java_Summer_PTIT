/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Admin
 */
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            BigInteger n = sc.nextBigInteger();
            BigInteger m = new BigInteger("11");
            if(n.mod(m).equals(BigInteger.ZERO)){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
            
        }
    
    
    }
}
