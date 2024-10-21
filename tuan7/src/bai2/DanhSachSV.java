package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSV {
    private ArrayList<SinhVien> ds;
    public DanhSachSV()
    {
        this.ds = new ArrayList<SinhVien>();
    }
    public  void themsv(SinhVien sv)
    {
        this.ds.add(sv);
    }
    public void inds()
    {
        for (SinhVien sv: ds) {
            System.out.println(sv);
        }
    }
    public void  nhapsv(int n)
    {
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<n;i++)
        {
            System.out.println("Nhap thong tin sinh vien thu " +(i+1) +":");
            SinhVien sv = new SinhVien();
            sv.nhapthongtin();
            themsv(sv);
        }
    }
    public void sapxepgiamdan()
    {
        Collections.sort(this.ds, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDtb()>sv2.getDtb())
                    return  -1;
                else
                if(sv1.getDtb()<sv2.getDtb())
                    return 1;
                else
                    return 0;
            }
        });
    }

}
