import java.util.Scanner;

public class bai11_baitap1 {
    public static void main(String[] args) {
        //bai1 tìm x và y khi biết tổng hiêệu
        System.out.println("Tìm X và Y khi biết tổng hiểu của chúng!!!");
        Scanner sc =new Scanner(System.in);
        System.out.print("Tổng của 2 số đó:");
        float tong = sc.nextFloat();
        System.out.print("Hiệu của 2 số đó:");
        float hieu = sc.nextFloat();
        // tính toán
        float x = (tong+hieu)/2;
        float y = tong-x;
        System.out.println("X="+x +"\nY="+y);
        //tính BMI
        System.out.println("Tính BMI!!!");
        Scanner cc =new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        float chieucao = cc.nextFloat();
        System.out.println("Nhập cân nặng: ");
        float cannang = cc.nextFloat();
        float bmi = cannang/(chieucao*2);
        if(bmi<15){
            System.out.println("Thân hình quá gầy!!");
        } else if(bmi>=15&& bmi<16){
            System.out.println("Thân hình gầy!!");
        } else if(bmi>=16&&bmi<18.5){
            System.out.println("Thân hình bình thường!!");
        }else if(bmi>=18.5&&bmi<25){
            System.out.println("Thân hình béo!!");
        }else if(bmi>=25 && bmi<30) {
            System.out.println("Thân bình béo phì!!");
        }else{
            System.out.println("Vui lòng nhập lại");
        }
    }
}
