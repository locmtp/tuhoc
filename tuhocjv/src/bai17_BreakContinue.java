public class bai17_BreakContinue {
    public static void main(String[] args) {
        // tính tổng từ 1-5 bỏ qua số 3
        int tong=0;
        for (int a=0;a<6;a++){
            if (a==3)     // không cần đóng mở {} cũng đc
                continue; //bỏ qua 3
            else
                tong += a;
        }
        System.out.println("Tổng từ 1-5 trừ 3 là: "+tong);
        //break
        int n=0;
        while (n<50){
            System.out.println("N= "+n);
            if (n==20)
                break;
            n++;
        }
    }
}
