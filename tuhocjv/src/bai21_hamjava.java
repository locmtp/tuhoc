import java.util.Scanner;

public class bai21_hamjava {
    public static void main(String[] args) {
        int kq=total(1,6,8);
        int kq2=total(6,1,1);
        System.out.println("Tổng các số = "+kq);
        System.out.println("Tổng các số = "+kq2);
        Scanner sc=new Scanner(System.in);
        System.out.printf("Mời nhập: ");
        String nhap = sc.nextLine();
        printGender(nhap);// no have return so no need add value
        printGender("malehj");
    }
    // hàm khai báo return k có sẽ lỗi
    public static int total(int x, int y,int z){
        return x+y+z; // trả về kiểu int ở trên static
    }
    public static void printGender(String gender){
        if (gender.equals("female"))
            System.out.println("Hello, i'm female employee!!");
        else if (gender.equals("male"))
            System.out.println("Hi, I'm male employee!!");
        else
            System.out.println("k có bede cho m nhập đâu");
        }

    }
