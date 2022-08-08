package ss_02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        int number;
        boolean check = true;
        int n = 2;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        number = scanner.nextInt();
        if (number >= 1)
        {
            System.out.println(number+" Số nguyên tố đầu tiên là:");
        }
        while (count < number)
        {
            for ( int j = 2 ; j <= Math.sqrt(n) ; j++ )
            {
                if ( n%j == 0 )
                {
                    check = false;
                    break;
                }
            }
            if ( check == true )
            {
                System.out.println(n);
                count++;
            }
            check = true;
            n++;
        }
    }
}
