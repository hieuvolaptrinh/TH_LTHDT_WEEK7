import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int otp= (int) (Math.random()*10000);
        System.out.println("Mã OTP của bạn là: "+otp);
        System.out.println("vui lòng nhập mã ptp của bạn");
        int nhap=sc.nextInt();
        if(nhap==otp){
            System.out.println("đăng nhập thành công");
        }
        else {
            System.out.println("đăng nhập thất bại");
        }

    }
}