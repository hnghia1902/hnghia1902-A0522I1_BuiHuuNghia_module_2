package quan_li_sinhvien.repository;

import quan_li_sinhvien.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Studenrepository implements IStudentrepository {

    private List<Student> studentList = new ArrayList<>();

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void remove(int ma) {
        for (int i = 0; i < studentList.size() ; i++) {
            if(studentList.get(i).getMa() == ma){
                studentList.remove(i);
            }
        }
    }



    @Override
    public List<Student> getAll() {
        return studentList;
    }
}
