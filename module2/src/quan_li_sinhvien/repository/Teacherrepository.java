package quan_li_sinhvien.repository;

import quan_li_sinhvien.model.Student;
import quan_li_sinhvien.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Teacherrepository implements ITeacherrepository {
    List<Teacher> teacherList = new ArrayList<>();
    @Override
    public void add(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void remove(int ma) {
        for (int i = 0; i < teacherList.size() ; i++) {
            if(teacherList.get(i).getMa() == ma){
                teacherList.remove(i);
            }
        }
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
}
