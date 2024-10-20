package bai2;

import java.util.Calendar;
import java.util.Scanner;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    private String maSV;
    private String hoTen;
    private Calendar ngaySinh;
    private float diemTB;
    private String hocLuc;

    public SinhVien(float diemTB, String hoTen, String maSV, Calendar ngaySinh, String hocLuc) {
        this.diemTB = diemTB;
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.ngaySinh = ngaySinh;
        this.hocLuc= xepLoai();
    }
    public SinhVien() {

    }

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        System.out.println("nhập mã sinh viên: ");
        this.maSV = sc.nextLine();
        System.out.println("nhập họ tên sinh viên: ");
        this.hoTen = sc.nextLine();

        System.out.println("nhập năm sinh: ");
        int nam = sc.nextInt();
        System.out.println("nhập tháng sinh: ");
        int thang = sc.nextInt();
        System.out.println("nhập ngày sinh: ");
        int ngay = sc.nextInt();
        sc.nextLine();
        this.ngaySinh = Calendar.getInstance();
        this.ngaySinh.set(nam, thang - 1, ngay);  // Tháng bắt đầu từ 0 nên phải trừ 1
        System.out.println("nhập điểm trung bình: ");
        this.diemTB = sc.nextFloat();
        sc.nextLine();
        this.hocLuc= xepLoai();
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Calendar getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Calendar ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    // Phương thức xác định học lực dựa trên điểm trung bình
    private String xepLoai() {
        if (this.diemTB >= 9) {
            return "Giỏi";
        } else if (this.diemTB >= 7.5) {
            return "Khá";
        } else if (this.diemTB >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    // Phương thức hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        System.out.println("Mã sinh viên: " + this.maSV);
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Ngày sinh: " + this.ngaySinh.get(Calendar.DAY_OF_MONTH) + "/" +
                (this.ngaySinh.get(Calendar.MONTH) + 1) + "/" + this.ngaySinh.get(Calendar.YEAR));
        System.out.println("Điểm trung bình: " + this.diemTB);
        System.out.println("Học lực: " + this.hocLuc);
    }

    // Phương thức so sánh để sắp xếp sinh viên theo điểm trung bình


}
