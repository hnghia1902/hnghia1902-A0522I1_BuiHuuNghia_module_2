package quan_li_sinhvien.repository;

import quan_li_sinhvien.model.Student;
import quan_li_sinhvien.service.IStudentservice;
import quan_li_sinhvien.service.Studentservice;

import java.util.ArrayList;
import java.util.List;

public class Studenrepository implements IStudentrepository {

    private List<Student> studentList = new ArrayList<>();

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void remove() {

    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
}
