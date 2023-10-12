import java.util.Scanner;

public class Bai21_baitap {
    /*Viết chương trình nhập từ bàn phím 2 số
     Nhập 1 kí tự + - * /
     Cho nó tự tính :)*/
    /*public static void main(String[] args) {
    calculation();
    }
    public static void calculation (){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number A: ");
        double a=sc.nextInt();
        System.out.print("Enter number B: ");
        double b= new Scanner(System.in).nextInt();
        System.out.print("Enter number + - x /:");
        String clt= new Scanner(System.in).nextLine();
        if (clt.equals("+")){
            System.out.println(a+"+"+b+"= "+(a+b));
        } else if (clt.equals("-")) {
            System.out.println(a+"-"+b+"= "+(a-b));
        }else if (clt.equals("x")) {
            System.out.println(a+"x"+b+"= "+(a*b));
        }else if (clt.equals("/")) {
            System.out.println(a+"/"+b+"= "+(a/b));
        }else {
            System.out.println("Nhập cho đúng!!");
        }
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        double a=sc.nextDouble();
        System.out.print("Enter B:");
        double b=new Scanner(System.in).nextDouble();
        System.out.print("Enter + - x /: ");
        String chon=new Scanner(System.in).nextLine();
        if (chon.equals("+")){
            total(a,b);
        } else if (chon.equals("-")) {
            subtraction(a,b);
        }else if (chon.equals("x")){
            multiplication(a,b);
        }else if (chon.equals("/")){
            division(a,b);
        }else {
            System.out.println("Nhập cho đúng cc!");
        }
    }
    public static void total(double a,double b){
        double total=a+b;
        System.out.println("The addition of two numbers is: "+total);
    }
    public static void subtraction(double a,double b){
        double subtraction=a-b;
        System.out.println("The subtraction of two numbers is: "+subtraction);
    }
    public static void multiplication(double a,double b){
        double multiplication=a*b;
        System.out.println("The multiplication of two numbers is: "+multiplication);
    }
    public static void division(double a,double b){
        double division=a/b;
        if (b==0){
            System.out.println("Error B different zero");
        }else {
            System.out.println("The division of two numbers is: " + division);
        }
    }
}
