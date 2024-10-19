package bai2;

public class Main {
    public static void main(String[] args) {
        DanhSachSinhVien dsSv = new DanhSachSinhVien();
        dsSv.nhapDanhSach();
        System.out.println("Danh sách sinh viên trước khi sắp xếp:");
        dsSv.inDanhSach();

        dsSv.sapXepTheoDiemTrungBinh();
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm trung bình giảm dần:");
        dsSv.inDanhSach();
    }
}
