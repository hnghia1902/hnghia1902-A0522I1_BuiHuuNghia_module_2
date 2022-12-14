package ss_03Mang_va_Phuong_thuc.bai_tap;

import java.util.Scanner;

public class Tong_cac_so_o_mot_cot_nhat_dinh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        System.out.print("Nhập số hàng: ");
        row = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        column = scanner.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập vị trí cột cần tính: ");
        int indexColumn = (scanner.nextInt()) - 1;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (indexColumn == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số ở cột " + (indexColumn + 1) + " là: " + sum);
    }
}
