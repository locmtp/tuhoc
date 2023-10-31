import java.util.Scanner;

public class bai26_btvd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create account");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Password: ");
        String pass = sc.nextLine();
        int a = pass.length();
        char checkpass;
        int n = 0, nn = 0;
        try {
            while (n <= a) {
                checkpass = pass.charAt(n);
                if (Character.isDigit(checkpass)) {
                    break;
                }
                n++;
            }
        } catch (Exception ex) {
            System.out.println("must have a number");
            ex.printStackTrace();
        }
        try {
            while (nn <= a) {
                checkpass = pass.charAt(nn);
                if (Character.isUpperCase(checkpass)) {
                    System.out.println("Success");
                    break;
                }
                nn++;
            }
        } catch (Exception ex) {
            System.out.println("must have a Upper case");
            ex.printStackTrace();
        }
    }


}

