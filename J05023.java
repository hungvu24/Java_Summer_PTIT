/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodeptit;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
class Lop{
    private String id , ten , lop , email;

    public Lop() {
    }

    public Lop(String id, String ten, String lop, String email) {
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
    public String toString(){
        return id + " " + ten + " " + lop + " " + email;
    }
}
public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lop> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            list.add(new Lop(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        int q = sc.nextInt();
        while(q -- > 0){
            String[] s = sc.next().split("\\s+");
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            String res = "";
            
            for (String i : s) {
                res += i.charAt(0);
                
            }
            for(int i = 0 ; i < list.size();i++){
                if(res.equals(list.get(i).getLop().subSequence(5, 7))){
                    System.out.println(list.get(i));
                }
            }
        }
    }
}