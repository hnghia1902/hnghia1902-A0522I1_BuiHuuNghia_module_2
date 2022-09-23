package quan_li_phuong_tien.repository;

import quan_li_phuong_tien.model.Xetai;

import java.util.List;

public interface IRepositoryPhuongTien {
    void add(Xetai xetai1);
    List<Xetai> get();
}
