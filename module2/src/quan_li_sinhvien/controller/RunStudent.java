package quan_li_sinhvien.controller;

import quan_li_sinhvien.service.IStudentservice;
import quan_li_sinhvien.service.Studentservice;

import java.util.Scanner;

public class RunStudent {

    public static void dsStudent(){
        IStudentservice iStudentservice = new Studentservice();
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN \n" +
                "1. Thêm mới học sinh.\n" +
                "2. Xóa học sinh\n" +
                "3. Xem danh sách học sinh\n" +
                "4. quay về menu chính");
        int chon = Integer.parseInt(scanner.nextLine());
        switch (chon) {
            case 1:
                iStudentservice.add();
                break;
            case 3:
                iStudentservice.hienthi();
                break;
        }
        }

    }
}
