package ss_02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Hien_thi_cac_loai_hinh {

    public static void main(String[] args) {

        for (int square = 7; square >= 1; square--) {

            for (int square2 = 14; square2 >= 1; square2--) {
                System.out.print("*");}
            System.out.println("*");
        }

        for(int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        for(int i=7;i>=1;i--){
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        Scanner sc = new Scanner(System.in);
        int hight, k = 0;
        System.out.printf("Nhap chieu cao hinh tam giac");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i, k = 0) {
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }

    }
    }
