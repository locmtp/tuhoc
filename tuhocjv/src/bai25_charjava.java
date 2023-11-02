import java.util.Scanner;

public class bai25_charjava {
    public static void main(String[] args) {
        //khởi tạo
        char ch = 'c';
        char ch1 = 65;
        char ch2; // khai báo
        System.out.println(ch);
        System.out.println(ch1);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Mời nhập kí tự vào đây: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0); //char ch4 = str.charAt(str.length() - 1); Truy xuất ký tự cuối cùng
        System.out.println("kí tự đầu tiên you nhập là: " + ch4);
        // compare là so sánh :0  sẽ lấy kí tự đằng trước trừ đằng sau
        System.out.println(Character.compare('b', 'b'));
        // b-b=0
        System.out.println(Character.compare('b', 'B'));
        // in bảng ASCII b is number 98 and B is 66
        System.out.println(Character.compare('B', 'b'));

        // Check kí tự
        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
        // Check True if is it number
        System.out.println(Character.isDigit(ch5));
        // check it có phải là chữ không
        System.out.println(Character.isLetter(ch6));
        //check nó có phải là chữ thường không
        System.out.println(Character.isLowerCase(ch6));
        //check chữ hoa
        System.out.println(Character.isUpperCase(ch7));
        // check khoảng trắng
        System.out.println(Character.isWhitespace(ch8));

        // bài tập nhập mật khẩu tối thiểu phải có 1 số và 1 chữ hoa và 1 kí tự đặt biệt
    }
}
