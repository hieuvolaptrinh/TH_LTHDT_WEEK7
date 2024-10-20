package bai1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhTron hinhTron = new HinhTron();
        System.out.println("Nhập bán kính: ");
        double banKinh = sc.nextDouble();
        hinhTron.setBanKinh(banKinh);
        System.out.println("Bán kính: " + hinhTron.getBanKinh());
        System.out.println("Chu vi: " + hinhTron.tinhChuVi());
        System.out.println("Diện tích: " + hinhTron.tinhDienTich());
    }
}
