package quan_li_phuong_tien.repository;

import quan_li_phuong_tien.model.Xetai;

import java.util.ArrayList;
import java.util.List;

public class RepositoryXeTai implements IRepositoryPhuongTien{
    List<Xetai> xetaiList = new ArrayList<>();

    @Override
    public void add(Xetai xetai1) {
        xetaiList.add(xetai1);
    }

    @Override
    public List<Xetai> get() {
        return xetaiList;
    }
}
