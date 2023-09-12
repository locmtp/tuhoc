public class bai15_doWhile {
    public static void main(String[] args) {
        // tính tổng các số từ 1 đến 5
        int a=1, tong=0;
        do {
            tong +=a;
            a++;
            // vòng lập doWhile sẽ chạy trước rồi mới kiểm tra điều kiện là while sai sẽ out
        }while (a<=5);
        System.out.println("Tổng từ 1 đến 5 là: "+tong);
        // Vòng lập while True
        // tăng N lên đến khi nào = 10 thì out
        int n=0;
        while (true){
            n++;
            System.out.println("N= "+n);
            if(n==10){
                break;
            }
        }
    }
}
