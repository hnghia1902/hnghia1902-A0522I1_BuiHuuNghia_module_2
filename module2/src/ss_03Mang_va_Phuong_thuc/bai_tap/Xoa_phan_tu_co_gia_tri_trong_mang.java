package ss_03Mang_va_Phuong_thuc.bai_tap;

import java.util.Scanner;

public class Xoa_phan_tu_co_gia_tri_trong_mang {
    public static void main(String[] args) {
        int size,i,c;

        int[] array;
        Scanner giatri = new Scanner(System.in);

        do {
            System.out.print("Nhập độ rộng của mảng : ");
            size = giatri.nextInt();
            if (size<=0){
                System.out.println("Hãy nhập một số lớn hơn 0");
            }
        }while (size <= 0);

        System.out.println("Nhập các phần tử cho mảng ");
        array = new int[size];

        for(int j = 0; j< array.length-1;j++ ){
            System.out.println("Nhập phần tử thứ "+(j+1)+" :" );
            array[j] = giatri.nextInt();
        }
        System.out.print("Nhập số nguyên K : " );
        int k = giatri.nextInt();

        for (c=i=0;i<array.length-1;i++){
            if (array[i] != k){
                array[c]=array[i];
                c++;
            }
        }
        size=c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
