package quan_li_phuong_tien.controller;

import quan_li_phuong_tien.service.IServicePhuongTien;
import quan_li_phuong_tien.service.ServiceXeTai;

import java.util.Scanner;

public class Mainrun {
    static IServicePhuongTien iServicePhuongTien = new ServiceXeTai();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println("--__CHƯƠNG TRÌNH QUẢN LÍ PHƯƠNG TIỆN GIAO THÔNG__--" +
                    "\n Chọn chức năng : " +
                    "\n1.Thêm mới phương tiện." +
                    "\n2.Hiển thị phương tiện." +
                    "\n3.xóa phương tiện." +
                    "\n4.Tìm kiếm theo biển kiểm soát." +
                    "\n5.Thoát.");
            byte chon = Byte.parseByte(scanner.nextLine());
            switch (chon){
                case 1:themmoi();
                break;
                case 2: hienthi();
                break;
                case 3: xoa();
                break;
                case 5:break;
            }
        }
    }
    public static void themmoi(){
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("1.Thêm mới xe tải" +
                    "\n2.Thêm mới oto" +
                    "\n3.Thêm mới xe máy");
            byte chon = Byte.parseByte(scanner.nextLine());
            switch (chon){
                case 1: iServicePhuongTien.add();
                    break;
                case 2:
                    break;
                case 5: return;
            }
        }
    }
    public static void hienthi(){

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Hiển thị xe tải." +
                    "\n2.Hiển thị xe ô tô." +
                    "\n3.Hiển thị xe máy.");
            byte chon = Byte.parseByte(scanner.nextLine());
            switch (chon){
                case 1: iServicePhuongTien.show();
                    break;
                case 2:
                    break;
                case 5: return;
            }
        }
    }
    public static void xoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Xóa xe tải." +
                "\n2.xóa xe ô tô." +
                "\n3.xóa xe máy");
        byte chon = Byte.parseByte(scanner.nextLine());
        switch (chon){
            case 1:
                System.out.println("Nhập vào biển kiểm soát muốn xóa");
                String bien_so_xe =  scanner.nextLine();
                iServicePhuongTien.xoa(bien_so_xe);
            break;
        }
    }

}
