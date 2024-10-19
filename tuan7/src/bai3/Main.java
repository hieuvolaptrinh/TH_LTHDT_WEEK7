package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        TaiKhoan tk=new TaiKhoan();
        tk.NhapThongTinKhachHang();
        do {
            System.out.println("Nhập 0 để thoát ");
            System.out.println("Nhập 1 để rút tiền ");
            System.out.println("Nhập 2 để gửi tiền ");
            System.out.println("Nhập 3 để xem số dư tài khoản");
            System.out.println("Nhập 4 để đổi mật khẩu ");
            System.out.println("Nhập 5 để xem thông tin khách hàng ");
            n = sc.nextInt();
            switch (n)
            {
                case 1 : tk.rutTien();break;
                case 2 : tk.guiTien();break;
                case 3 : tk.kiemTraSoDu();break;
                case 4 : tk.DoiMatKhau();break;
                case 5 : tk.InThongTinKhachHang();break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ!");
            }
        }while (n!=0);
    }
}
