package quan_li_phuong_tien.model;

import java.util.ArrayList;
import java.util.List;

public class Hangsanxuat {
    protected String mahangsanxuat;
    protected String tenhangsanxuat;
    protected String quocgia;

    public Hangsanxuat() {
    }

    public Hangsanxuat(String mahangsanxuat, String tenhangsanxuat, String quocgia) {
        this.mahangsanxuat = mahangsanxuat;
        this.tenhangsanxuat = tenhangsanxuat;
        this.quocgia = quocgia;
    }

    public String getMahangsanxuat() {
        return mahangsanxuat;
    }

    public void setMahangsanxuat(String mahangsanxuat) {
        this.mahangsanxuat = mahangsanxuat;
    }

    public String getTenhangsanxuat() {
        return tenhangsanxuat;
    }

    public void setTenhangsanxuat(String tenhangsanxuat) {
        this.tenhangsanxuat = tenhangsanxuat;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    @Override
    public String toString() {
        return "Hangsanxuat{" +
                "mahangsanxuat='" + mahangsanxuat + '\'' +
                ", tenhangsanxuat='" + tenhangsanxuat + '\'' +
                ", quocgia='" + quocgia + '\'' +
                '}';
    }
}
