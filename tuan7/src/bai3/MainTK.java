package bai3;

import java.util.Scanner;

public class MainTK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoan tk = new TaiKhoan("123456","Huỳnh Lê Tiến Hiển", 0 );
        tk.taoMatkhau();
        System.out.println(tk);
        int luachon =0;
        do {
            System.out.println("1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Kiểm tra số dư");
            System.out.println("4. Đổi mật khẩu");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn chức năng: ");
            luachon = sc.nextInt();
            if (luachon == 1)
                tk.guitien();
            else
            if(luachon == 2)
                tk.ruttien();
            else
            if(luachon == 3)
                System.out.println("Số dư của bạn là: "+tk.kiemtrasodu() +" VNĐ");
            else
            if (luachon==4)
                tk.doiMatKhau();
        }while (luachon!=0);
    }
}
