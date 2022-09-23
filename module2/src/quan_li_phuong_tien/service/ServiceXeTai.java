package quan_li_phuong_tien.service;


import quan_li_phuong_tien.model.Hangsanxuat;
import quan_li_phuong_tien.model.Xetai;
import quan_li_phuong_tien.repository.IRepositoryPhuongTien;
import quan_li_phuong_tien.repository.RepositoryXeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceXeTai implements IServicePhuongTien{
    Scanner scanner = new Scanner(System.in);
    IRepositoryPhuongTien iRepositoryPhuongTien = new RepositoryXeTai();
    public Hangsanxuat input_hxs(){
        System.out.println("Nhập mã hãng sản xuất : ");
        String ma_hsx = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất : ");
        String ten_hxs = scanner.nextLine();
        System.out.println("Nhập tên quốc gia : ");
        String qg = scanner.nextLine();
        Hangsanxuat hangsanxuat = new Hangsanxuat(ma_hsx,ten_hxs,qg);
        return hangsanxuat;
    }
    public Xetai input_data(){
        System.out.println("Nhập biển kiểm soát");
        String bks = scanner.nextLine();
        List<Hangsanxuat> hangsanxuatList = new ArrayList<>();
        hangsanxuatList.add(input_hxs());
        System.out.println("Năm xuất khẩu : ");
        String nxk = scanner.nextLine();
        System.out.println("Chủ sở hữu : ");
        String csh = scanner.nextLine();
        System.out.println("Trọng tải : ");
        String tt = scanner.nextLine();
        Xetai xetai = new Xetai(bks,hangsanxuatList,nxk,csh,tt);
        return xetai;
    }
    @Override
    public void add() {
        Xetai xetai1 = this.input_data();
        iRepositoryPhuongTien.add(xetai1);
    }

    @Override
    public void show() {
    List<Xetai> xetais = iRepositoryPhuongTien.get();
    for (Xetai xetai : xetais){
        System.out.println(xetai);
    }

    }
}
