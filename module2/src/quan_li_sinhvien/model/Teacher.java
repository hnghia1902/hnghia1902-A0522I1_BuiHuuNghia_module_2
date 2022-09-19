package quan_li_sinhvien.model;

public class Teacher extends Person {
    private String chuyenmon;

    public Teacher(String teacher) {
        this.chuyenmon = teacher;
    }

    public Teacher(int ma, String ten, String ngaysinh, String gioitinh, String teacher) {
        super(ma, ten, ngaysinh, gioitinh);
        this.chuyenmon = teacher;
    }

    public String getTeacher() {
        return chuyenmon;
    }

    public void setTeacher(String teacher) {
        this.chuyenmon = teacher;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Teacher{" +
                "teacher='" + chuyenmon + '\'' +
                '}';
    }
}
