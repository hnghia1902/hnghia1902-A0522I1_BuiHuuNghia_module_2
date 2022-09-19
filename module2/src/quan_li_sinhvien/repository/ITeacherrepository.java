package quan_li_sinhvien.repository;

import quan_li_sinhvien.model.Student;
import quan_li_sinhvien.model.Teacher;

import java.util.List;

public interface ITeacherrepository {
    void add(Teacher teacher);
    void remove(int ma);



    List<Teacher> getAll();
}
