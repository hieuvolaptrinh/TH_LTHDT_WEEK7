package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachTaiKhoan danhSachTaiKhoan = new DanhSachTaiKhoan();
        int luaChon;
        do {
            System.out.println("1. Đăng ký tài khoản");
            System.out.println("2. Đăng nhập");
            System.out.println("0. thoát");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("nhập số tài khoản:");
                    String soTK = sc.nextLine();
                    System.out.println("nhập chủ tài khoản:");
                    String chuTK = sc.nextLine();
                    System.out.println("nhập mật khẩu:");
                    String matKhau = sc.nextLine();
                    TaiKhoan taiKhoan = new TaiKhoan(chuTK, soTK, matKhau);
                    danhSachTaiKhoan.dangKiTaiKhoan(taiKhoan);
                    break;
                case 2:
                    System.out.println("nhập số tài khoản:");
                    String stkDangNhap = sc.nextLine();
                    System.out.println("nhập mật khẩu:");
                    String mkDangNhap = sc.nextLine();
                    TaiKhoan taiKhoanDangNhap= danhSachTaiKhoan.dangNhapTaiKhoan(stkDangNhap, mkDangNhap);
                    if(taiKhoanDangNhap==null){
                        System.out.println("vui lòng đăng nhập lại.");
                        break;
                    }
                    else {
                        System.out.println("đăng nhập thành công");
                        int luaChonDichVu;
                        do {
                            System.out.println("1.Gửi tiền");
                            System.out.println("2.Rút tiền");
                            System.out.println("3.Kiểm tra số dư");
                            System.out.println("4.Đổi mật khẩu");
                            System.out.println("5. chuyển tiền");
                            System.out.println("0.Đăng xuất");
                            luaChonDichVu = sc.nextInt();
                            sc.nextLine();
                            switch (luaChonDichVu) {
                                case 1:
                                    System.out.println("nhập số tiền bạn muốn gửi:");
                                    long tienGui = sc.nextLong();
                                    taiKhoanDangNhap.guiTien(tienGui);
                                    break;
                                case 2:
                                    System.out.println("nhập số tiền bạn muốn rút:");
                                    long tienRut = sc.nextLong();
                                    taiKhoanDangNhap.rutTien(tienRut);
                                    break;
                                case 3:
                                    taiKhoanDangNhap.kiemTraSoDu();
                                    break;
                                case 4:
                                    System.out.println("vui lòng nhập mật khẩu hiện tại:");
                                    String mkht = sc.nextLine();
                                    taiKhoanDangNhap.doiMatKhau(mkht);
                                    break;
                                case 5:
                                    System.out.println("nhập số tài khoản bạn muốn chuyển tiền:");
                                    String stkNhan = sc.nextLine();
                                    if(danhSachTaiKhoan.danhSachTaiKhoan.containsKey(stkNhan)==false){
                                        System.out.println("số tài khoản không tồn tại.");
                                        break;
                                    }
                                    System.out.println("nhập số tiền bạn muốn chuyển:");
                                    long tienChuyen = sc.nextLong();
                                    sc.nextLine();
                                    danhSachTaiKhoan.chuyenTien(taiKhoanDangNhap, stkNhan, tienChuyen);
                                    break;
                                case 0:
                                    System.out.println("đăng xuất thành công.");
                                    break;
                                default:
                                    System.out.println("lựa chọn của bạn khoogn hợp lệ.");
                            }
                        } while (luaChonDichVu != 0);
                        break;
                    }

                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (luaChon != 0);
    }
}
