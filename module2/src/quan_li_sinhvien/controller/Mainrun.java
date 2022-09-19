package quan_li_sinhvien.controller;

import java.util.Scanner;

public class Mainrun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.print("--CHƯƠNG TRÌNH QUẢN DANH SÁCH SINH VIÊN VÀ GIẢNG VIÊN--__\n" +
                    "Chọn chức năng theo số : \n" +
                    "1. Tương tác với danh sách sinh viên \n" +
                    "2. Tương tác với danh sách giảng viên \n" +
                    "3. thoát chương trình \n" +
                    "Chọn chức năng : ");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1: RunStudent.dsStudent();
                    break;
                case 2: Runteacher.dsTeacher();
                    break;
                case 3: System.exit(3);
            }
        }

    }
}
