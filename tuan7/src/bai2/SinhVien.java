package bai2;

import java.util.Calendar;
import java.util.Scanner;

public class SinhVien implements  Comparable<SinhVien>{
    Scanner sc = new Scanner(System.in);
    private String maSV;
    private String hoTen;
    private Calendar ngaySinh;
    private float diemTB;

    public SinhVien(String maSV, String hoTen, Calendar ngaySinh, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public SinhVien() {
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

    public void nhapThongTin(){
        System.out.println("Nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        this.hoTen = sc.nextLine();

        System.out.println("Nhap nam sinh: ");
        int nam = sc.nextInt();
        System.out.println("Nhap thang sinh: ");
        int thang = sc.nextInt();
        System.out.println("Nhap ngay sinh: ");
        int ngay = sc.nextInt();
        sc.nextLine();
        this.ngaySinh= Calendar.getInstance();
        this.ngaySinh.set(nam, thang - 1, ngay);  // Tháng tính từ 0, nên phải trừ 1
        System.out.println("Nhap diem trung binh: ");
        this.diemTB = sc.nextFloat();
    }
    public void inThongTin(){
        System.out.println("Ma sinh vien: "+this.maSV);
        System.out.println("Ho ten sinh vien: "+this.hoTen);
        System.out.println("Ngay sinh: "+this.ngaySinh.get(Calendar.DATE)+"/"+(this.ngaySinh.get(Calendar.MONTH)+1)+"/"+this.ngaySinh.get(Calendar.YEAR));
        System.out.println("Diem trung binh: "+this.diemTB);
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public int compareTo(SinhVien o) {
        return Float.compare(this.diemTB, o.diemTB);
    }
}
