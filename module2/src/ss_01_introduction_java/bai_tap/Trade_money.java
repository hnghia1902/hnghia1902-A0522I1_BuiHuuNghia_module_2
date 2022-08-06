package ss_01_introduction_java.bai_tap;

import java.util.Scanner;

public class Trade_money {
    public static void main(String[] args) {
        int vnd = 23500;
        int usd;

        Scanner tien = new Scanner(System.in);

        System.out.print("Nhap so USD can chuyen qua VND : ");
        usd = tien.nextInt();

        int trade = vnd * usd;

        System.out.println("So tien doi tu USD sang VND la : " + trade);


    }
}
