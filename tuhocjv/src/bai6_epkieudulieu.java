public class bai6_epkieudulieu {
    public static void main(String[] args) {
        // ép kiểu rộng
        int a=5,b=10;
        double kq=(double) a/b; //Ép kiểu bé qua lớn int>> double
        System.out.println("kết quả: "+kq);

        //ép kiểu hẹp
        int e=128;
        byte f=(byte) e;
        System.out.println(e);
        System.out.println(f); //vì là ép kiểu hẹp từ lớn xuống bé nên bị mất dữ liệu cho ra kq k đúng
    }
}
