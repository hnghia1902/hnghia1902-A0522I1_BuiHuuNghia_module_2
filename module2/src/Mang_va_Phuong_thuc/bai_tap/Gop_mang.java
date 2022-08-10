package Mang_va_Phuong_thuc.bai_tap;

import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        short array1[];
        short array2[];
        short array3[];
        short size;

        Scanner nhap = new Scanner(System.in);

        do{
            System.out.print("Nhập độ lớn của mảng : ");
            size = nhap.nextShort();
        }while (size<0);

        array1 = new short[size];
        array2 = new short[size];
        array3 = new short[(size*2)];

        for (short i = 0; i<=array1.length-1;i++){
            System.out.print("Nhập phần tử thứ " + (i+1) + ":");
            array1[i] = nhap.nextShort();
        }
        for (short i = 0; i<=array2.length-1;i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ":");
            array2[i] = nhap.nextShort();
        }
        System.out.println("");
        System.out.print("Mảng sau khi nhập vào là : ");
        for (short i = 0; i<=array1.length-1;i++){
            System.out.print(array1[i]+ "   ");
        }
        System.out.println("");
        System.out.print("Mảng sau khi nhập vào là : ");
        for (short i = 0; i<=array2.length-1;i++) {
            System.out.print(array2[i] + "   ");
        }
        for (short i = 0;i<= array1.length-1;i++){
            array3[i] = array1[i];
        }
        for (short i = 0;i<= array2.length-1;i++){
                array3[(array1.length)+i]=array2[i];
        }

        System.out.println("");
        System.out.println("Mảng sau khi gộp là");
        for (short i = 0; i<=array3.length-1;i++){
            System.out.print(array3[i]+ "   ");
        }
    }
}

