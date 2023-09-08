import java.util.Scanner;

public class bai11_if_eles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập điểm của bạn: ");
        double diemtb = sc.nextDouble();
        if (diemtb>=8 && diemtb<10){
            System.out.println("Giỏi");
        } else if (diemtb>=6.5 && diemtb<8) {
            System.out.println("Khá");
        } else if (diemtb>=5 && diemtb<6.5) {
            System.out.println("trung bình");
        }else {
            System.out.println("yếu");
        }
    }
}
