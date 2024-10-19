package bai3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaiKhoan {
    private String soTK;
    private String tenTK;
    private double soDu;
    private String matKhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String soTK, String tenTK, double soDu, String matKhau) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }

    //Phương thức gửi tiền
    public void guiTien() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mật khẩu :");
        String matKhau = sc.nextLine();
        if (matKhau.equals(this.matKhau))
        {
            System.out.println("Nhập số tiền cần gửi : ");
            double tienGui = sc.nextDouble();
            if (tienGui > 0)
            {
                this.soDu += tienGui;
                System.out.println("Đã gửi " + tienGui + " vào tài khoản. Số dư hiện tại: " + soDu);
            }
            else
                System.out.println("Số tiền gửi không hợp lệ.");
        }
        else
            System.out.println("Mật khẩu không đúng !");
    }

    // Phương thức rút tiền
    public void rutTien() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mật khẩu :");
        String matKhau = sc.nextLine();
        if (matKhau.equals(this.matKhau))
        {
            System.out.println("Nhập số tiền bạn cần rút :");
            double tienRut=sc.nextDouble();
            if (tienRut > 0 && tienRut <= this.soDu)
            {
                this.soDu -= tienRut;
                System.out.println("Đã rút " + tienRut + " từ tài khoản. Số dư hiện tại: " + soDu);
            }
            else
                if (tienRut > this.soDu)
                    System.out.println("Số dư không đủ để rút tiền.");
                else
                    System.out.println("Số tiền rút không hợp lệ.");
        }
        else
            System.out.println("Mật khẩu không đúng !");
    }

    // Phương thức kiểm tra số dư
    public void kiemTraSoDu() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mật khẩu :");
        String matKhau = sc.nextLine();
        if (matKhau.equals(this.matKhau))
            System.out.println("Số dư hiện tại: " + this.soDu);
        else
            System.out.println("Mật khẩu không đúng !");
    }
    //Phương thức nhập thông tin khách hàng
    public void NhapThongTinKhachHang(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số tài khoản :");
        this.soTK=sc.nextLine();
        System.out.print("Nhập tên tài khoản :");
        this.tenTK=sc.nextLine();
        System.out.printf("Nhập mật khẩu :");
        this.matKhau=sc.nextLine();
        System.out.print("Nhập số dư :");
        this.soDu=sc.nextDouble();
    }
    //Phương thức xuất ra thông tin khách hàng
    public void InThongTinKhachHang(){
        System.out.println("Số tài khoản : "+this.soTK);
        System.out.println("Tên tài khoản :"+this.tenTK);
        System.out.println("Số dư tài khoản :"+this.soDu);
        System.out.println("-----------------");
    }
    public void DoiMatKhau(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mật khẩu cũ :");
        String matKhauCu = sc.nextLine();
        if (matKhauCu.equals(this.matKhau))
        {
            System.out.println("Nhập mật khẩu mới :");
            String matKhauMoi = sc.nextLine();
            this.matKhau=matKhauMoi;
            System.out.println("Đổi mật khẩu thành công !");
        }
        else
            System.out.println("Mật khẩu cũ không đúng!");

    }
}
