package bai2;

import java.util.*;

public class DanhSachSV {
    Scanner sc = new Scanner(System.in);
    private LinkedHashMap<String, SinhVien> danhSachSV ;

    public DanhSachSV() {
        this.danhSachSV = new LinkedHashMap<>();
    }
//    nhập thông tin sinh viên
    public void nhapDSSV(){
        int n;
        System.out.println("Nhập số lượng sinh viên: ");
        n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            SinhVien sv= new SinhVien();
            sv.nhapThongTin();
            danhSachSV.put(sv.getMaSV(),sv);
        }
    }
//    hiển thị thông tin sinh viên
    public void xuatDSSV(){
//        for( Map.Entry<String, SinhVien> entry : danhSachSV.entrySet()){
//            System.out.println(entry.getValue().toString());
//        }
        for(String key : this.danhSachSV.keySet()){
            this.danhSachSV.get(key).hienThiThongTin();
        }
    }
//    sắp xếp sinh viên dựa trên điểm trung bình
    public void sapxepgiamdan(){
        List<Map.Entry<String, SinhVien>> list = new ArrayList<>(danhSachSV.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, SinhVien>>() {
            @Override
            public int compare(Map.Entry<String, SinhVien> o1, Map.Entry<String, SinhVien> o2) {
                if(o1.getValue().getDiemTB() < o2.getValue().getDiemTB()){
                    return 1;
                }
                else if(o1.getValue().getDiemTB() > o2.getValue().getDiemTB()){
                    return -1;
                }
                else return 0;
            }
        });
        // Xóa toàn bộ danh sách cũ trong HashMap
        danhSachSV.clear();

        // Thêm lại các entry đã sắp xếp vào danhSachSV
        for (Map.Entry<String, SinhVien> entry : list) {
            danhSachSV.put(entry.getKey(), entry.getValue());
        }


    }
}
