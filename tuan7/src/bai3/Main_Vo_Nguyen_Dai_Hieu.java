package bai3;
import java.util.Scanner;

public class Main_Vo_Nguyen_Dai_Hieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachTaiKhoan_HashMap_Vo_Nguyen_Dai_Hieu danhSachTaiKhoan = new DanhSachTaiKhoan_HashMap_Vo_Nguyen_Dai_Hieu();
        int luaChon;
        do {
            System.out.println("1. đăng ký tài khoản");
            System.out.println("2. đan g nhập");
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
                    TaiKhoan_Vo_Nguyen_Dai_Hieu taiKhoan = new TaiKhoan_Vo_Nguyen_Dai_Hieu(chuTK, soTK, matKhau);
                    danhSachTaiKhoan.dangKiTaiKhoan(taiKhoan);
                    break;
                case 2:
                    System.out.println("nhập số tài khoản:");
                    String stkDangNhap = sc.nextLine();
                    System.out.println("nhập mật khẩu:");
                    String mkDangNhap = sc.nextLine();
                    TaiKhoan_Vo_Nguyen_Dai_Hieu taiKhoanDangNhap= danhSachTaiKhoan.dangNhapTaiKhoan(stkDangNhap, mkDangNhap);
                    if(taiKhoanDangNhap==null){
                        System.out.println("vui lòng đăng nhập lại.");
                        break;
                    }
                    else {

                        int luaChonDichVu;
                        do {
                            System.out.println("1.Gửi tiền");
                            System.out.println("2.Rút tiền");
                            System.out.println("3.Kiểm tra số dư");
                            System.out.println("4.Đổi mật khẩu");
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
