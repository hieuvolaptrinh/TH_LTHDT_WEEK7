package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSV {
    private ArrayList<SinhVien> dssv;
    public DanhSachSV()
    {
        this.dssv = new ArrayList<SinhVien>();
    }
    public  void themsv(SinhVien sv)
    {
        this.dssv.add(sv);
    }
    public void inds()
    {
        for (SinhVien sv: dssv) {
            System.out.println(sv);
        }
    }
    public void  nhapsv(int n)
    {

        for (int i =0;i<n;i++)
        {
            System.out.println("Nhap thong tin sinh vien thu " +(i+1) +":");
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            themsv(sv);
        }
    }
    public void sapxepgiamdan()
    {
        Collections.sort(this.dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTB()>sv2.getDiemTB())
                    return  -1;
                else
                if(sv1.getDiemTB()<sv2.getDiemTB())
                    return 1;
                else
                    return 0;
            }
        });
    }
}
