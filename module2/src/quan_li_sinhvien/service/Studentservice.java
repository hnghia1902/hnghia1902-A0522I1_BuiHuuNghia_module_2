package quan_li_sinhvien.service;

import quan_li_sinhvien.model.Student;
import quan_li_sinhvien.repository.IStudentrepository;
import quan_li_sinhvien.repository.Studenrepository;

import java.util.List;
import java.util.Scanner;

public class Studentservice implements IStudentservice {
    IStudentrepository iStudentrepository = new Studenrepository();
    Scanner scanner = new Scanner(System.in);

    private Student themStudent(){
        System.out.println("Nhập mã sinh viên : ");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sinh viên : ");
        String ten = scanner.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String ngaysinh = scanner.nextLine();
        System.out.println("Nhập giới tính : ");
        String gioitinh = scanner.nextLine();
        System.out.println("Nhập lớp : ");
        String lop = scanner.nextLine();
        System.out.println("Nhập điểm : ");
        float diem = Float.parseFloat(scanner.nextLine());
        Student student = new Student(ma,ten,ngaysinh,gioitinh,lop,diem);
        return student;
    }

    @Override
    public void add() {
        Student student = this.themStudent();
        iStudentrepository.add(student);


    }

    @Override
    public void remove(int ma) {
        iStudentrepository.remove(ma);
    }

    public void hienthi(){
        List<Student> studentList = iStudentrepository.getAll();
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}
