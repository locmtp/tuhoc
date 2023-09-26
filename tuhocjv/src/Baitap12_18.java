import java.util.Scanner;

public class Baitap12_18 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--------Chọn bài tập--------");
            System.out.println("1. Viết chương trình nhập số nguyên in ra kết quả N!.");
            System.out.println("2. Tổng các số chẵn từ N đến 0.");
            System.out.println("3. Tổng các số lẻ trừ 3.");
            System.out.println("4. Tổng các số chia hết cho 3 từ 10-50.");
            System.out.println("5. Tính Tổng S='1!+2!+3!+....+10!'");
            System.out.println("6. Tìm các số hoàn hảo từ 1-1000.");
            System.out.printf("Mời nhập: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Scanner bai1 = new Scanner(System.in);
                    System.out.print("Nhập số nguyên: ");
                    int n1 = bai1.nextInt();
                    int tong = 1, a = n1;
                    if (n1 > 15) {
                        System.out.printf("nhập số quá lớn mới nhập lại bé hơn 15");
                        break;
                    } else {
                        while (n1 > 0) {
                            tong *= n1;
                            n1--;
                        }
                        System.out.println(a + "!= " + tong);
                        break;
                    }
                case 2:
                    //Scanner bai2 = new Scanner(System.in);
                    System.out.printf("Mời nhập N: ");
                    int n2 = new Scanner(System.in).nextInt();
                    int tong2 = 0;
                    if (n2 % 2 == 0) {
                        while (n2 > 0) {
                            tong2 += n2;
                            n2 -= 2;
                        }
                        System.out.println("" + tong2);
                    } else {
                        System.out.println("Tôi không tính số lẻ -_- see you!!");
                    }
                    break;
                case 3:
                    System.out.printf("Mời nhập N: ");
                    int n3 = new Scanner(System.in).nextInt();
                    int tong3 = 0;
                    for (; n3 % 3 == 0; n3 -= 3) {
                        if (n3 == 0)
                            break;
                        if (n3 == 3) {
                            continue;
                        } else {
                            tong3 += n3;
                        }
                    }
                    System.out.println("Tổng các số lẻ trừ 3 là: " + tong3);
                    break;
                case 4:
                    int n4 = 12;
                    while (n4 < 51) {
                        System.out.println("Tổng các số từ 10-50 là: " + n4);
                        n4 += 3;
                    }
                    break;
                case 5:
                    int tong5 = 1, tong5_5 = 0;
                    for (int n5 = 1; n5 < 11; n5++) {
                        tong5 *= n5;
                        tong5_5 += tong5;
                    }
                    System.out.println("" + tong5_5);
                    break;
                case 6:
                    for (int n6 = 1; n6 <= 1000; n6++) {
                        int tong6 = 0;
                        for (int i = 1; i < n6; i++) {
                            if (n6 % i == 0) {
                                tong6 += i;
                            }
                        }
                        if (tong6 == n6)
                            System.out.println(n6 + " là số hoàn hảo!!");
                        else
                            continue;
                    }
                    break;
            }
            System.out.println("Nhập phím Y để thoát chương trình!!!");
            String out=new Scanner(System.in).nextLine();
            if (out.equals("y")||out.equals("Y"))
                break;
        }
    }
}
