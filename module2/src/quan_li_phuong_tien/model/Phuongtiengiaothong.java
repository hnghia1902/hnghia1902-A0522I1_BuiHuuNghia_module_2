package quan_li_phuong_tien.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Phuongtiengiaothong {
    private String bienkiemsoat;
    private List<Hangsanxuat> hangsanxuat = new ArrayList<>();
    private String namsanxuat;
    private String chusohuu;

    public Phuongtiengiaothong() {
    }

    public Phuongtiengiaothong(String bienkiemsoat, List<Hangsanxuat> hangsanxuat, String namsanxuat, String chusohuu) {
        this.bienkiemsoat = bienkiemsoat;
        this.hangsanxuat = hangsanxuat;
        this.namsanxuat = namsanxuat;
        this.chusohuu = chusohuu;
    }

    public String getBienkiemsoat() {
        return bienkiemsoat;
    }

    public void setBienkiemsoat(String bienkiemsoat) {
        this.bienkiemsoat = bienkiemsoat;
    }

    public List<Hangsanxuat> getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(List<Hangsanxuat> hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public String getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(String namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public String getChusohuu() {
        return chusohuu;
    }

    public void setChusohuu(String chusohuu) {
        this.chusohuu = chusohuu;
    }

    @Override
    public String toString() {
        return "Phuongtiengiaothong{" +
                "bienkiemsoat='" + bienkiemsoat + '\'' +
                ", hangsanxuat=" + hangsanxuat +
                ", namsanxuat='" + namsanxuat + '\'' +
                ", chusohuu='" + chusohuu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phuongtiengiaothong that = (Phuongtiengiaothong) o;
        return Objects.equals(bienkiemsoat, that.bienkiemsoat) && Objects.equals(hangsanxuat, that.hangsanxuat) && Objects.equals(namsanxuat, that.namsanxuat) && Objects.equals(chusohuu, that.chusohuu);
    }

}
