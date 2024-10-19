package bai1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        bai1_HCN hcn = new bai1_HCN();
        bai1_HCN hcn2 = new bai1_HCN(3,4);
        System.out.println("chieu dai va rong cua hình chữ nhật 2 lần lược là "+ hcn2.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        float dai=sc.nextFloat();
        System.out.println("nhap chieu rong hcn");
        float rong=sc.nextFloat();
        hcn.setDai(dai);
        hcn.setRong(rong);
        System.out.println("chieu dai va rong cua hình chữ nhật lần lược là "+ hcn.toString());
        System.out.println("chu vi hcn la: "+hcn.tinhChuVi());
        System.out.println("dien tich hcn la: "+hcn.tinhDienTich());
    }
}
