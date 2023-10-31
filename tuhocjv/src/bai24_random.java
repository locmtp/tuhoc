import java.util.Random;

public class bai24_random {
    public static void main(String[] args) {
        Random rd= new Random();
        // run số nguyên
        int koden100= rd.nextInt(0,101); // have number 0 but just take <101
        System.out.println(koden100);
        // run số thực
        double x =rd.nextDouble(11); // run 0 to 10
        System.out.println(x);
    }
}
