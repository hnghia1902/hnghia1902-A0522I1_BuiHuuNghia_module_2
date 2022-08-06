package ss_01_introduction_java.bai_tap;

import java.util.Scanner;

public class Diem_so {
    public static void main(String[] args) {

        Scanner nhapso = new Scanner(System.in);

        System.out.print("Nhap so ban muon diem :");
        int so = nhapso.nextInt();

        String a1 = new String();
        String a2 = new String();
        String a3 = new String();

        int tram = so /100;
        int chuc = so %100/10 ;
        int donvi = so % 10;

        switch (tram){
            case 1:a1 = "mot tram "  ;
            break;
            case 2:a1 = "hai tram "   ;
                break;
            case 3:a1 = "ba tram "   ;
                break;
            case 4:a1 = "bon tram "   ;
                break;
            case 5:a1 = "nam tram "   ;
                break;
            case 6:a1 = "sau tram "   ;
                break;
            case 7:a1 = "bay tram "   ;
                break;
            case 8:a1 = "tam tram "   ;
                break;
            case 9:a1 = "chin tram "   ;
                break;
        }
        switch (chuc){
            case 1:a2 = "muoi "  ;
                break;
            case 2:a2 = "hai muoi "  ;
                break;
            case 3:a2 = "ba muoi "  ;
                break;
            case 4:a2 = "bon muoi "  ;
                break;
            case 5:a2 = "nam muoi "  ;
                break;
            case 6:a2 = "sau muoi "  ;
                break;
            case 7:a2 = "bay muoi "  ;
                break;
            case 8:a2 = "tam muoi "  ;
                break;
            case 9:a2 = "chin muoi "  ;
                break;
        }
        switch (donvi){
            case 1:a3 = "mot "  ;
                break;
            case 2:a3 = "hai "   ;
                break;
            case 3:a3 = "ba "   ;
                break;
            case 4:a3 = "bon "   ;
                break;
            case 5:a3 = "nam "   ;
                break;
            case 6:a3 = "sau "   ;
                break;
            case 7:a3 = "bay "   ;
                break;
            case 8:a3 = "tam "   ;
                break;
            case 9:a3 = "chin "   ;
                break;
        }
        System.out.println("so can dem la: " + a1 + a2 + a3 );

    }
}
