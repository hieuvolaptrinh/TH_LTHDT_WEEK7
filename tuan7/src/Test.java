package Bai1;
public class HinhChuNhat {
    public double chieuDai;
    public double chieuRong;
    
    public double DienTich(){
        return chieuDai*chieuRong;
    }
    
    public double ChuVi(){
        return (chieuDai+chieuRong)*2;
    }
    
}

// Sử dụng chung package Bai1
//package Bai1;
public class Test {
    public static void main(String[] args){
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.chieuDai = 5;
        hcn.chieuRong=7;
        
        System.out.println("Dien tich hinh chu nhat=" +hcn.DienTich());
        System.out.println("Chu vi hinh chu nhat=" +hcn.ChuVi());
    }
    
}