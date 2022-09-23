package quan_li_phuong_tien.model;

import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class Oto extends Phuongtiengiaothong {
    private String chongoi;
    private String kieuxe;

    public Oto(String chongoi, String kieuxe) {
        this.chongoi = chongoi;
        this.kieuxe = kieuxe;
    }

    public Oto(String bienkiemsoat, List<Hangsanxuat> hangsanxuat, String namsanxuat, String chusohuu, String chongoi, String kieuxe) {
        super(bienkiemsoat, hangsanxuat, namsanxuat, chusohuu);
        this.chongoi = chongoi;
        this.kieuxe = kieuxe;
    }

    public Oto() {

    }



    public String getChongoi() {
        return chongoi;
    }

    public void setChongoi(String chongoi) {
        this.chongoi = chongoi;
    }

    public String getKieuxe() {
        return kieuxe;
    }

    public void setKieuxe(String kieuxe) {
        this.kieuxe = kieuxe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                super.toString()+
                "chongoi='" + chongoi + '\'' +
                ", kieuxe='" + kieuxe + '\'' +
                '}';
    }


}
