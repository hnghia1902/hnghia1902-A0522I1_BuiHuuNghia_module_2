package Mang_va_Phuong_thuc.bai_tap;

import java.util.Scanner;

public class Chen_phan_tu_vao_mang {
    public static void main(String[] args) {

        byte[] arr = {3, 22, 35, 1, 50, 12, 79};
        int size = arr.length + 1;
        byte[] arr2 = new byte[size];

        Scanner input = new Scanner(System.in);


        System.out.printf("Mảng ban đầu:");
        for (byte i = 0; i < arr.length; i++) {
            System.out.printf(" " + arr[i] + ",");
        }

        System.out.println("");
        System.out.printf("Nhập số cần chèn:");
        byte X = input.nextByte();
        System.out.printf("Nhập vị trí chèn:");
        byte index = input.nextByte();

        if (index <= 1 || index >= arr2.length - 1) {
            System.out.println("không thể chèn");
        } else {
            for (byte i = 0; i < arr2.length - 1; i++) {
                arr2[i] = arr[i];
            }
            arr2[arr2.length - 1] = 0;
            for (byte i = 0; i < arr2.length; i++) {
                if (index == i) {
                    for (int j = arr2.length - 1; j > i; j--) {
                        arr2[j] = arr2[j - 1];
                    }
                    arr2[i] = X;
                }
            }
            System.out.printf("Mảng sau khi chèn:");
            for (byte i = 0; i < arr2.length; i++) {
                System.out.printf(" " + arr2[i] + "   ");
            }
        }
    }}