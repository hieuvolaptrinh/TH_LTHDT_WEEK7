package bai3;
import java.util.Scanner;

public class TaiKhoan_Vo_Nguyen_Dai_Hieu {
    Scanner sc = new Scanner(System.in);
    public String soTK;
    public String chuTk;
    private long soDu;
    private String matKhau;

    public TaiKhoan_Vo_Nguyen_Dai_Hieu(String chuTk, String matKhau, long soDu, String soTK) {
        this.chuTk = chuTk;
        this.matKhau = matKhau;
        this.soDu = soDu;
        this.soTK = soTK;
    }

    public TaiKhoan_Vo_Nguyen_Dai_Hieu(String chuTk, String soTK, String matKhau) {
        this.chuTk = chuTk;
        this.matKhau = matKhau;
        this.soDu = 0;
        this.soTK = soTK;
    }
    public TaiKhoan_Vo_Nguyen_Dai_Hieu() {
    }
    public String getChuTk() {
        return chuTk;
    }
    public void setChuTk(String chuTk) {
        this.chuTk = chuTk;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public long getSoDu() {
        return soDu;
    }

    public void setSoDu(long soDu) {
        this.soDu = soDu;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }
    //    phương thức gửi thêm tiền zo tài khoản
    public void guiTien(long tienGui) {
        boolean check = false;
        int dem = 0;
        String mk;
        do {
            System.out.println("vui long nhap mat khau");
            mk = sc.nextLine();
            if (mk.equals(this.matKhau)) {
                System.out.println("bạn vừa nạp " + tienGui + " vào tài khoản");
                this.setSoDu(this.getSoDu() + tienGui);
                System.out.println("số dư hiện tại của bạn là " + this.getSoDu());
                check = true;
            } else {
                dem++;
                if (dem >= 2) {
                    System.out.println("nhập sai mật khẩu quá 2 lần, dịch vụ bị khóa.");
                    break;
                } else {
                    System.out.println("Sai mật khẩu, vui lòng nhập lại.");
                }
            }
        } while (check == false);
    }
    //    phương thức rút tiền
    public void rutTien(long tienRut) {
        boolean check = false;
        int dem = 0;
        String mk;
        do {
            System.out.println("vui long nhap mat khau");
            mk = sc.nextLine();
            if (mk.equals(this.matKhau)) {
                if (tienRut > this.getSoDu()) {
                    System.out.println("số dư không đủ để thực hiện giao dịch.");
                } else {
                    System.out.println("bạn vừa rút " + tienRut + " từ tài khoản.");
                    this.setSoDu(this.getSoDu() - tienRut);
                    System.out.println("số dư hiện tại của bạn là " + this.getSoDu());
                    check = true;
                }
            } else {
                dem++;
                if (dem >= 2) {
                    System.out.println("nhập sai mật khẩu quá 2 lần, dịch vụ bị khóa.");
                    break;
                } else {
                    System.out.println("sai mật khẩu, vui lòng nhập lại.");
                }
            }
        } while (check == false);
    }
    //    kiểm tra số dư
    public void kiemTraSoDu() {
        boolean check = false;
        int dem = 0;
        String mk;
        do {
            System.out.println("vui long nhap mat khau");
            mk = sc.nextLine();
            if (mk.equals(this.matKhau)) {
                System.out.println("số dư hiện tại của bạn là " + this.getSoDu());
                check = true;
            } else {
                dem++;
                if (dem >= 2) {
                    System.out.println("nhập sai mật khẩu quá 2 lần, dịch vụ bị khóa.");
                    break;
                } else {
                    System.out.println("sai mật khẩu, vui lòng nhập lại.");
                }
            }
        } while (check == false);
    }

    public void doiMatKhau(String mk) {
        if (mk.equals(this.matKhau)) {
            System.out.println("vui long nhap mat khau moi");
            String mkMoi = sc.nextLine();
            setMatKhau(mkMoi);
            System.out.println("bạn đã đổi mật khẩu thành công, thông tin tài khoản hiện tại của bạn là ");
            System.out.println("chủ tài khoản " + this.chuTk);
            System.out.println("số tài khoản " + this.soTK);
            System.out.println("mat khau moi la" + this.matKhau);
        } else
            System.out.println("bạn đã nhập sai mật khẩu ");
    }
}
