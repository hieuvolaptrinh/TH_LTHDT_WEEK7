package Bai2;

import java.util.Scanner;
public class SinhVien {
        private String MaSv;
        private String Ten;
        private String NgSinh;
        private double DTB;

        public SinhVien(String MaSv, String Ten, String NgSinh, double DTB) {
            this.MaSv = MaSv;
            this.Ten = Ten;
            this.NgSinh = NgSinh;
            this.DTB = DTB;
        }

        public void Nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ma sinh vien:");
            this.MaSv = sc.nextLine();
            System.out.println("Nhap ten:");
            this.Ten = sc.nextLine();
            System.out.println("Nhap ngay sinh:");
            this.NgSinh = sc.nextLine();
            System.out.println("Nhap diem trung binh:");
            this.DTB = sc.nextDouble();
        }

        public void In() {
            System.out.println("Ma sinh vien:" + MaSv);
            System.out.println("Ten:" + Ten);
            System.out.println("Ngay sinh:" + NgSinh);
            System.out.println("Diem trung binh:" + DTB);
        }

        public double getDiemTrungBinh() {
            return DTB;
        }
    }
// test

//package Bai2;

import java.util.Scanner;
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        SinhVien[] DSSV = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
            DSSV[i] = new SinhVien("", "", "", 0.0); // Khởi tạo đối tượng SinhVien rỗng
            DSSV[i].Nhap();
        }
        for (int i = 0; i < n - 1; i++) {
            boolean DoiCho = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (DSSV[j].getDiemTrungBinh() < DSSV[j + 1].getDiemTrungBinh()) {
                    SinhVien temp = DSSV[j];
                    DSSV[j] = DSSV[j + 1];
                    DSSV[j + 1] = temp;
                    DoiCho = true;
                }
            }
            if (!DoiCho)
                break;
        }
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình giảm dần:");
        for (SinhVien sv : DSSV) {
                sv.In();
        }
    }
}