import java.util.Scanner;

public class bai12_toantu3ngoi_viettat_ifelse {
    public static void main(String[] args) {
        // nhập bàn phím 1 số kiểm tra chẵn lẻ
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập từ bàn phím 1 số nguyên: ");
        int n = sc.nextInt();
        String ktra = (n%2==0)?"chẵn":"lẻ"; 
        System.out.println("Số đã nhập là số "+ktra);
        // Tính điểm trung bình của sinh viên!!
        Scanner scScore = new Scanner(System.in);
        System.out.println("Nhập Tên: ");
        String name=scScore.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        float diemtb=scScore.nextFloat();
        // toán tử 3 ngôi
        String ktra1 = (diemtb>=8&&diemtb<10)?"giỏi":
                (diemtb>=6.5)?"khá":
                        (diemtb>=5)?"trung bình":"yếu";
        System.out.println(name+" bạn là học sinh "+ktra1);

    }
}
