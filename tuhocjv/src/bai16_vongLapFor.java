public class bai16_vongLapFor {
    public static void main(String[] args) {
         for (int i=0;i<12;i+=2){ // i+=2 == i= i+2
    // nếu muốn chạy lùi thì điều kiện sẽ là (i=12;i>=0;i+=2)
             System.out.println("i= "+i);
         }
         //đề bài tính tổng số chẵn từ 0-10
        int tong=0;
        for (int x=0;x<=10;x+=2){
            tong+=x;
        }
        System.out.println("Tổng số chẵn từ 0-10 là: "+tong);
    }
}
