package bai1;

public class HinhTron {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh > 0)
            this.banKinh = banKinh;
        else
            System.out.println("Bans kính phai lon hơn 0");
    }
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
