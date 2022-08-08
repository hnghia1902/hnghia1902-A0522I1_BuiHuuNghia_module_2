package ss_02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        int number = 100;
        boolean check = true;
        int n = 2;
        int count = 0;
        System.out.println(" các số nguyên tố nhỏ hơn 100 là :");

        for (int i = 0; i<=100;i++)
        {
            for ( int j = 2 ; j <= Math.sqrt(n) ; j++ )
            {
                if ( n%j == 0 )
                {
                    check = false;
                    break;
                }
            }
            if ( check == true && n<=100 )
            {
                System.out.println(n);
            }
            check = true;
            n++;
        }
    }
}
