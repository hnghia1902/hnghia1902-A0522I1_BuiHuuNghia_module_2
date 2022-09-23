package quan_li_phuong_tien.model;

import java.util.List;

public class Xetai extends Phuongtiengiaothong {
    private String  trongtai;

    public Xetai(String trongtai) {
        this.trongtai = trongtai;
    }

    public Xetai(String bienkiemsoat, List<Hangsanxuat> hangsanxuat, String namsanxuat, String chusohuu, String trongtai) {
        super(bienkiemsoat, hangsanxuat, namsanxuat, chusohuu);
        this.trongtai = trongtai;
    }

    public String getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(String trongtai) {
        this.trongtai = trongtai;
    }

    @Override
    public String toString() {
        return "Xetai{" +
                super.toString()+
                "trongtai='" + trongtai + '\'' +
                '}';
    }
}
