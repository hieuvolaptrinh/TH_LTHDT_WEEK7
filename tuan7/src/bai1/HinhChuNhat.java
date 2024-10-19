package bai1;

import java.util.Scanner;

public class HinhChuNhat {
    private double chieudai;
    private double chieurong;

    public HinhChuNhat() {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu dai hinh chu nhat:");
        this.chieudai =sc.nextDouble();
        System.out.println("Nhap chieu rong hinh chu nhat:");
        this.chieurong =sc.nextDouble();
    }
    public double TinhS(){
        return chieudai*chieurong;
    }
    public double TinhChuVi(){
        return (chieudai+chieurong)*2;
    }
    public void HienThiDienTich(){
        System.out.println("Dien tich hinh chu nhat la : "+TinhS());
    }
    public void HienThiChuVi(){
        System.out.println("Chu vi hình chư nhat la :"+TinhChuVi());
    }
}
