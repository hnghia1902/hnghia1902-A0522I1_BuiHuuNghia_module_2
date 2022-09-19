package quan_li_sinhvien.service;


import quan_li_sinhvien.model.Teacher;
import quan_li_sinhvien.repository.ITeacherrepository;
import quan_li_sinhvien.repository.Teacherrepository;


import java.util.List;
import java.util.Scanner;

public class Teacherservice implements ITeacherservice {
    ITeacherrepository iTeacherrepository = new Teacherrepository();
    Scanner scanner = new Scanner(System.in);
    private Teacher themgiangvien(){
        System.out.println("Nhập mã giảng viên : ");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên giảng viên : ");
        String ten = scanner.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String ngaysinh = scanner.nextLine();
        System.out.println("Nhập giới tính : ");
        String gioitinh = scanner.nextLine();
        System.out.println("Nhập chuyên môn : ");
        String chuyenmon = scanner.nextLine();
        Teacher teacher = new Teacher(ma,ten,ngaysinh,gioitinh,chuyenmon);
        return teacher;


    }

    @Override
    public void add() {
        Teacher teacher = this.themgiangvien();
        iTeacherrepository.add(teacher);
    }

    @Override
    public void remove(int ma) {
        iTeacherrepository.remove(ma);
    }

    @Override
    public void hienthi() {
        List<Teacher> teacherList = iTeacherrepository.getAll();
        for (Teacher teacher : teacherList){
            System.out.println(teacher);
        }
    }
}
