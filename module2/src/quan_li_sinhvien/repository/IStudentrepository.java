package quan_li_sinhvien.repository;

import quan_li_sinhvien.model.Student;

import java.util.List;

public interface IStudentrepository {
    void add(Student student);
    void remove();
    List<Student> getAll();
}
