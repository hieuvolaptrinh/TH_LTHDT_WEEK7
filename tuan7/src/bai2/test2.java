package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> dsSV= new ArrayList<>();
        System.out.println("Nhap so sinh vien: ");
        int n = sc.nextInt();
        for( int i=0;i<n;i++){
            SinhVien sv = new SinhVien();
            System.out.println("nhập thông tin sinh viên thu" + (i+1));
            sv.nhapThongTin();
            dsSV.add(sv);
        }
        System.out.println("danh sách sinh viên vừa nhập là ");
        for(SinhVien sv1:dsSV){
            sv1.inThongTin();
        }
        System.out.println("sắp xếp danh sách sinh viên có ddiem tăngs dần là ");
//        Collections.sort(dsSV);

//        hoặc nếu việt gộp cũng được nếu như chưa viết compareTo ở SINHVIEN
//        Collections.sort(dsSV, new Comparator<bai2_SV>() {
//            @Override
//            public int compare(bai2_SV o1, bai2_SV o2) {
//                if(o1.getDiemTB()>o2.getDiemTB()){
//                    return 1;
//                }
//                else if(o1.getDiemTB()==o2.getDiemTB()){
//                    return 0;
//                }
//                else return -1;
//            }
//        });
        for(SinhVien sv1:dsSV){
            sv1.inThongTin();
        }
    }
}
