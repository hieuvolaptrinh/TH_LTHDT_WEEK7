package bai3;

import java.util.HashMap;

public class DanhSachTaiKhoan {
    HashMap<String, TaiKhoan> danhSachTaiKhoan;

    public DanhSachTaiKhoan() {
        this.danhSachTaiKhoan = new HashMap<>();
    }

    //    thêm một người dùng vào trong danh sách tk
    public void dangKiTaiKhoan(TaiKhoan taiKhoan) {
        String soTK = taiKhoan.getSoTK();
        if (this.danhSachTaiKhoan.containsKey(soTK) == true)
            System.out.println("tài khoản đã tồn tại ở trong hệ thống");
        else {
            this.danhSachTaiKhoan.put(soTK, taiKhoan);
            System.out.println("đăng ký tài khoản thành công");
        }
    }

    //    đăng nhập tài khoản vào hệ thống
    public TaiKhoan dangNhapTaiKhoan(String soTK, String matKhau) {
        TaiKhoan taiKhoan = this.danhSachTaiKhoan.get(soTK);
        if (taiKhoan == null || !taiKhoan.getMatKhau().equals(matKhau)) {
            System.out.println("đăng nhập thất bại, số tài khoản hoặc mật khẩu không đúng");
            return null;
        }
        System.out.println("đăng nhập thành công");
        return taiKhoan;
    }

    //phương thức chuyển tiền
    public void chuyenTien(TaiKhoan taiKhoanDangNhap, String stkNhan, long tienChuyen) {
        TaiKhoan taiKhoanNhan = this.danhSachTaiKhoan.get(stkNhan);
        if (taiKhoanNhan == null) {
            System.out.println("Số tài khoản nhận không tồn tại.");
            return;
        }
        if (taiKhoanDangNhap.getSoDu() < tienChuyen) {
            System.out.println("Số dư không đủ để chuyển tiền.");
            return;
        }
        taiKhoanDangNhap.chuyenTien(tienChuyen);
        taiKhoanNhan.setSoDu(taiKhoanNhan.getSoDu()+tienChuyen);
        System.out.println("Chuyển tiền thành công.");
    }
}
