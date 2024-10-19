/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
public class TaiKhoan {
        private String STK;
        private String ChuTK;
        private double SoDu;
        private String MatKhau;  

        public TaiKhoan(String STK, String ChuTK, double SoDu) {
            this.ChuTK = ChuTK;
            this.STK = STK;
            this.SoDu = SoDu;
        }

    
        public void TaoMk(String mk) {
            this.MatKhau = mk;
            System.out.println("Mat khau da tao thanh cong");
        }

        
        public void DoiMk(String mkc, String mkm) {
            if (this.MatKhau.equals(mkc)) {
                this.MatKhau = mkm;
                System.out.println("Mat khau moi da doi thanh cong");
            } else {
                System.out.println("Mat khau cu khong dung");
            }
        }

        public void Gui(double SoTien) {
            if (SoTien > 0) {
                SoDu = SoDu + SoTien;
                System.out.println("So tien da gui la: " + SoTien);
            } else {
                System.out.println("Tien gui phai lon hon 0 dong nha ban iu");
            }
        }

        public void RutTien(double SoTien) {
            if (SoTien > 0 && SoTien <= SoDu) {
                SoDu = SoDu - SoTien;
                System.out.println("So tien da rut la: " + SoTien);
            } else if (SoTien > SoDu) {
                System.out.println("So du khong du ban oi.");
            } else {
                System.out.println("Tien rut phai lon hon 0 dong nha ban iu");
            }
        }

        public void KiemTra() {
            System.out.println("So du hien tai cua ban la: " + SoDu);
        }

        public void InTT() {
            System.out.println("So Tai khoan: " + STK);
            System.out.println("Chu tai khoan: " + ChuTK);
            System.out.println("So du: " + SoDu);
            System.out.println("Mat khau: " + MatKhau);
        }
    }
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Bai3;
import java.util.Scanner;
public class TestTK {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so TK:");
        String STK = sc.nextLine();

        System.out.println("Chu tai khoan:");
        String ChuTK = sc.nextLine();

        System.out.println("So du hien tai:");
        double SoDu = sc.nextDouble();
        sc.nextLine();  

        TaiKhoan TKNH = new TaiKhoan(STK, ChuTK, SoDu);

        System.out.println("Tao mat khau moi:");
        String mk = sc.nextLine();
        TKNH.TaoMk(mk);

        System.out.println("Doi mat khau. Nhap mat khau cu:");
        String mkc = sc.nextLine();
        System.out.println("Nhap mat khau moi:");
        String mkm = sc.nextLine();
        TKNH.DoiMk(mkc,mkm);
        
        TKNH.InTT();

        System.out.println("Nhap so tien muon gui:");
        double TienGui = sc.nextDouble();
        TKNH.Gui(TienGui);
        TKNH.KiemTra();

        System.out.println("Nhap so tien muon rut:");
        double TienRut = sc.nextDouble();
        TKNH.RutTien(TienRut);
        TKNH.KiemTra();
    }
    
}
  

