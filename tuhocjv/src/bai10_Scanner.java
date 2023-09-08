import java.util.Scanner;

public class bai10_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // cho phép nhập chỗi
        System.out.print("Nhập mk cấp 1 của bạn: ");
        String mk1=sc.nextLine();
        System.out.println("mk cấp 1 của bạn là: "+mk1);
        // tương tụ với các kiểu khác!!

        // nếu nhập xen kẽ giữa số và chữ lỗi thì phải khai báo từng đối tượng vd:
        System.out.print("Mời nhập tuổi: ");
        int tuoi= new Scanner(System.in).nextInt();
        System.out.printf("Tuổi của bạn là: "+tuoi);
        // tương tụ với các kiểu khác!!
    }
}
