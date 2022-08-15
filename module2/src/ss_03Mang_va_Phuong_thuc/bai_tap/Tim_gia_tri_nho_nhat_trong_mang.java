package ss_03Mang_va_Phuong_thuc.bai_tap;

import java.util.Scanner;

public class Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int size;

        int[] array;
        Scanner giatri = new Scanner(System.in);

        do {
            System.out.print("Nhập độ rộng của mảng : ");
            size = giatri.nextInt();
            if (size<=0){
                System.out.println(" Hãy nhập một số lớn hơn 0");
            }
        }while (size <= 0);

        System.out.print("Nhập các phần tử cho mảng \n");
        array = new int[size];

        for(int j = 0; j< array.length-1;j++ ){
            System.out.print("Nhập phần tử thứ "+(j+1)+" : " );
            array[j] = giatri.nextInt();
        }
        int min = array[0];
        for (int i = 1 ; i < array.length;i++){
            if (min < array[i]){
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min);
    }
}
