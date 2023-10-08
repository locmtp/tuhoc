import java.rmi.AlreadyBoundException;
import java.util.Scanner;

public class bai20_xulyngoaile {
    public static void main(String[] args) {
        int a=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập b: ");
        int b= sc.nextInt();
        try {
            int c=a/b;
            System.out.println("c= "+c);
        }
        catch (ArithmeticException ex){
            // chỉ bắt lỗi của số học nếu k phải xuống dưới Exception bắt tất cả các lỗi
            System.out.println("có lỗi ở đây!!");
            ex.printStackTrace();
        }
        catch (Exception ex){    // bắt tất cả các lỗi
            System.out.println("có lỗi r!!!!");
            ex.printStackTrace();
        }
        finally {
            // bỏ qua lỗi và chạy code trong này bth
            System.out.println("có lỗi hay k thì vẫn chạy được");
        }
        System.out.println("Đoạn code phía sau");
    }
}
