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

/**
 *
 * @author Admin
 */
class Xephang implements Comparable<Xephang> {

    private String name;
    int baidung, submit;

    public Xephang() {
    }

    public Xephang(String name, int baidung, int submit) {
        this.name = name;
        this.baidung = baidung;
        this.submit = submit;
    }

    @Override
    public int compareTo(Xephang o) {
        if (this.baidung != o.baidung) {
            return o.baidung - this.baidung; // Số bài làm đúng nhiều hơn xếp trước
        } else if (this.submit != o.submit) {
            return this.submit - o.submit; // Số lượt submit ít hơn xếp trước
        } else {
            return this.name.compareTo(o.name); // Sắp xếp họ tên theo thứ tự từ điển
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.baidung + " " + this.submit;
    }
}

public class J05042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Xephang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String name = sc.nextLine();
            String []a = sc.nextLine().split(" ");
            int baidung = Integer.parseInt(a[0]);
            int submit = Integer.parseInt(a[1]);
            Xephang xh = new Xephang(name, baidung, submit);
            list.add(xh);
        }
        Collections.sort(list);
        for (Xephang i : list) {
            System.out.println(i);
            
        }

    }

}
