import java.util.Scanner;

public class bai13_Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Chọn bài tập:");
        int chon= sc.nextInt();
        switch (chon){
            case 1:
                //Nhập tháng xem tháng đó có bao nhieeu ngày!!
                Scanner scc = new Scanner(System.in);
                System.out.print("Mời nhập 1 tháng: ");
                int a= scc.nextInt();
                switch (a){
                    case 1:
                    case 3:
                    case 5:
                    case 8:
                    case 12:
                    case 10:
                        System.out.println("Tháng "+a+" có 31 ngày");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Tháng "+a+" có 30 ngày");
                        break;
                    case 2:
                        System.out.println("Tháng 2 có 29 hoặc 30 ngày");
                        break;
                    default:
                        System.out.println("Vui lòng nhập tháng từ 1-12!!");
                        break;
                }
                break;
            case 2:
                // bài tập
                Scanner bt = new Scanner(System.in);
                System.out.println("Mời 1 số để chọn:\n1. Tìm theo tên\n2. Tìm theo tác giả\n3. Tìm theo nhà xuất bản\n4: Tìm theo tiêu đề");
                System.out.printf("");
                int b = bt.nextInt();
                switch (b){
                    case 1:
                        System.out.printf("Tìm theo tên");
                        break;
                    case 2:
                        System.out.printf("Tìm theo tác giả");
                        break;
                    case 3:
                        System.out.printf("Tìm theo nhà xuất bản");
                        break;
                    case 4:
                        System.out.printf("Tìm theo tiêu đề");
                        break;
                    default:
                        System.out.printf("Nhập không hợp lệ!!!");
                        break;
                }
                break;
            default:
                System.out.printf("bài "+chon+" chưa làm :))");

        }
    }
}
