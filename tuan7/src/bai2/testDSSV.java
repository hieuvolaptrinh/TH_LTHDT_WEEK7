package bai2;

import java.util.Scanner;

public class testDSSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV danhSachSV = new DanhSachSV();
        int luaChon;

        do {
            System.out.println("----------- MENU -----------");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. in danh sach sinh vien");
            System.out.println("3. sap xep danh sach theo diem trung binh giam dan");
            System.out.println("4. thoat");
            System.out.print("nhap lua chon cua ban: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    danhSachSV.nhapDSSV();
                    break;
                case 2:
                    System.out.println("danh sach sinh vien:");
                    danhSachSV.xuatDSSV();

                    break;
                case 3:
                    System.out.println("danh sach sinh vien sau khi sap xep giam dan theo diem trung binh:");
                    danhSachSV.sapxepgiamdan();
                    danhSachSV.xuatDSSV();
                    break;
                case 4:
                    System.out.println("thoat chuong trinh.");
                    break;
                default:
                    System.out.println("lua chon khong dúng");
                    break;
            }
        } while (luaChon != 4);

    }
}
