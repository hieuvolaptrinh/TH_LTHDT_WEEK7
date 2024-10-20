package bai1;

public class HinhTron {
    private double banKinh;
    public HinhTron() {
            }
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public void setBanKinh(double banKinh) {
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            System.out.println("Bán kính phải lớn hơn 0.");
        }
    }

    // Phương thức lấy banKinh
    public double getBanKinh() {
        return banKinh;
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
