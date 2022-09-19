package quan_li_sinhvien.model;

import java.util.Objects;

public class Person {
    private int ma;
    private String ten;
    private String ngaysinh;
    private String gioitinh;

    public Person() {
    }

    public Person(int ma, String ten, String ngaysinh, String gioitinh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(ma, person.ma);
    }

}
