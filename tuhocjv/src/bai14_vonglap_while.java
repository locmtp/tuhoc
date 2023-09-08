import java.util.Scanner;

public class bai14_vonglap_while {
    public static void main(String[] args) {
        // Viết chương trình nhập từ bàn phím từ 1 đến 99!!
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập từ bàn phím từ 1 đến 99:");
        int a = sc.nextInt();
        while (a < 1 || a > 99) {
            // nếu nhập đúng thì sẽ cho tiếp tục nhập khi nào sai sẽ tự out vòng lập
            System.out.printf("Vui lòng nhập lại số từ 1-99:");
            // bắt nhập lại
            a = sc.nextInt();
        }
        System.out.printf("Bạn nhập thành đã nhập thành công!!!");

    }
}
