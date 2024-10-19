package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> sinhVienList;

    public DanhSachSinhVien() {
        sinhVienList = new ArrayList<>();
    }

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien("", "", null, 0);
            sv.nhapThongTin();
            sinhVienList.add(sv);
        }
    }

    public void inDanhSach() {
        for (SinhVien sv : sinhVienList) {
            sv.inThongTin();
            System.out.println("------------------");
        }
    }

    public void sapXepTheoDiemTrungBinh() {
        Collections.sort(sinhVienList, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh());
            }
        });
    }
}

