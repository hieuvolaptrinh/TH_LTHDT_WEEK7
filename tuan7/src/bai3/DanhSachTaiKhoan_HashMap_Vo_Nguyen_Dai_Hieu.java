package bai3;
import java.util.HashMap;

public class DanhSachTaiKhoan_HashMap_Vo_Nguyen_Dai_Hieu {
    private HashMap<String, TaiKhoan_Vo_Nguyen_Dai_Hieu> danhSachTaiKhoan;

    public DanhSachTaiKhoan_HashMap_Vo_Nguyen_Dai_Hieu() {
        this.danhSachTaiKhoan = new HashMap<>();
    }
//    thêm một người dùng vào trong danh sách tk
    public void dangKiTaiKhoan(TaiKhoan_Vo_Nguyen_Dai_Hieu taiKhoan){
        String soTK= taiKhoan.getSoTK();
        if(this.danhSachTaiKhoan.containsKey(soTK)==true)
            System.out.println("tài khoản đã tồn tại ở trong hệ thống");
        else{
            this.danhSachTaiKhoan.put(soTK,taiKhoan);
            System.out.println("đăng ký tài khoản thành công");
        }
    }
//    đăng nhập tài khoản vào hệ thống
    public TaiKhoan_Vo_Nguyen_Dai_Hieu dangNhapTaiKhoan(String soTK, String matKhau){
       TaiKhoan_Vo_Nguyen_Dai_Hieu taiKhoan= this.danhSachTaiKhoan.get(soTK);
         if(taiKhoan==null || !taiKhoan.getMatKhau().equals(matKhau)){
              System.out.println("đăng nhập thất bại, số tài khoản hoặc mật khẩu không đúng");
              return null;
         }
         System.out.println("đăng nhập thành công");
            return taiKhoan;
    }
}
