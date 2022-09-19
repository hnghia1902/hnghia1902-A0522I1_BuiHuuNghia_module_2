package quan_li_sinhvien.controller;

import quan_li_sinhvien.service.ITeacherservice;
import quan_li_sinhvien.service.Teacherservice;

import java.util.Scanner;

public class Runteacher {
    public static void dsTeacher(){
        ITeacherservice iTeacherservice = new Teacherservice();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN \n" +
                    "1. Thêm mới giảng viên.\n" +
                    "2. Xóa giảng viên\n" +
                    "3. Xem danh sách giảng viên\n" +
                    "4. quay về menu chính \n" +
                    "Chọn chức năng theo số : ");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    iTeacherservice.add();
                    break;
                case 2: {
                    System.out.print("\nNhập vào id cần xóa : ");
                    int ma = Integer.parseInt(scanner.nextLine());
                    iTeacherservice.remove(ma);
                    break;
                }
                case 3:
                    iTeacherservice.hienthi();
                    break;
                case 4: return;
            }
        }

    }
}
