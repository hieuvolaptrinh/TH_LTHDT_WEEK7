package bai2;

import java.util.Scanner;

public class MainSV {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien muon nhap: ");
        int n =sc.nextInt();
        DanhSachSV dssv = new DanhSachSV();
        dssv.nhapsv(n);
        System.out.println("Danh sach sinh vien: ");
        dssv.inds();
        dssv.sapxepgiamdan();
        System.out.println("Danh sap sinh vien sau khi sap xap: ");
        dssv.inds();
    }
}

