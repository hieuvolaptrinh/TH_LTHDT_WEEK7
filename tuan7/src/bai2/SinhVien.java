package bai2;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String ten;
    private Ngay ngaySinh;
    private double diemTrungBinh;

    public SinhVien(String maSV, String ten, Ngay ngaySinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.maSV = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập ngày sinh (ngày tháng năm): ");
        int ngay = sc.nextInt();
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        this.ngaySinh = new Ngay(ngay, thang, nam);
        System.out.print("Nhập điểm trung bình: ");
        this.diemTrungBinh = sc.nextDouble();
        sc.nextLine();
    }

    public void inThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
}

