/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacodeptit;

/**
 *
 * @author Admin
 */
import java.util.Arrays;
import java.util.Scanner;

public class Javacodeptit {

    public static boolean hasPythagoreanTriplet(int[] arr) {
        int n = arr.length;

        // Bình phương tất cả các phần tử
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Sắp xếp dãy số
        Arrays.sort(arr);

        // Duyệt từng phần tử từ cuối đến đầu
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    return true;
                } else if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            if (hasPythagoreanTriplet(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
