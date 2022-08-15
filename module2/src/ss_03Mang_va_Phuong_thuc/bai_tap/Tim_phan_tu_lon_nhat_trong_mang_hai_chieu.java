package ss_03Mang_va_Phuong_thuc.bai_tap;

import java.util.Scanner;

public class Tim_phan_tu_lon_nhat_trong_mang_hai_chieu {
    public static void main(String[] args) {

        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận : ");
        short row = nhap.nextShort();

        System.out.print(" \n Nhập số cột của ma trận : ");
        short col = nhap.nextShort();

        float[][] array = new float[row][col];

        for (short i = 0; i < array.length; i++) {
            for (short j = 0; j < array[i].length; j++) {
                System.out.print("  Nhập phần tử thứ [" + (i + 1) + "][" + (j + 1) + "] : ");
                array[i][j] = nhap.nextFloat();
            }
        }

        System.out.println("Ma trận vừa nhập : ");
        for (short i = 0; i< array.length;i++){
            for (short j = 0;j< array[i].length;j++){
                System.out.print(""+array[i][j]+ "\t");
            }
            System.out.printf("\n");
        }
        float max = array[0][0];

        for (short i = 0; i < array.length;i++){
            for (short j = 0 ; j < array[i].length; j++) {
                if (max <= array[i][j]){
                    max = array[i][j];
                }
            }
        }

        String[] cdn = new String[row * col];
        short ep = 0;
        for (short i = 0; i< array.length; i++){
            for (short j = 0; j < array[i].length; j++){
                if (max == array[i][j]){
                    ep += 1;
                    cdn[ep -1] = "Hàng : " + (i+1) +"\n" + "Cột : " +(j+1);
                }
            }
        }
        System.out.println("Max Của ma trận là : "+ max);
        if (ep == 1){
            System.out.print("Max ở tọa độ là : ");
            System.out.print(""+ cdn[0] + ", " + "\n" );
        }else {
            System.out.print("Max ở tọa độ :\n ");
            for(short i = 0;i<ep;i++){
                System.out.print(" ["+(cdn[i])+ ";");
            }

        }
    }

}
