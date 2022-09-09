package quan_li_sinhvien.model;

public class Student extends Person {
    private String lop;
    private float diemso;

    public Student(int ma, String ten, String ngaysinh, String gioitinh, String lop, float diemso) {
        super(ma, ten, ngaysinh, gioitinh);
        this.lop = lop;
        this.diemso = diemso;
    }

    public Student() {
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiemso() {
        return diemso;
    }

    public void setDiemso(float diemso) {
        this.diemso = diemso;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lop='" + lop + '\'' +
                ", diemso=" + diemso +
                '}'+super.toString();
    }
}
