import java.util.Calendar;
import java.util.Scanner;

public class bai22_VD {
    /* Viết chương trình nhập ngày tháng năm sinh
    * tính tuổi và in ra màn hình */
    public static void main(String[] args) {
        int day, month, year;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.printf("Ngày sinh: ");
            day=sc.nextInt();
            while (day<1||day>31){
                System.out.println("Nhập lại ngày sinh: ");
                day=new Scanner(System.in).nextInt();
            }
        System.out.printf("Tháng sinh: ");
        month=sc.nextInt();
            while (month>12||month<=1){
                System.out.println("Nhập lại Tháng sinh: ");
                month=new Scanner(System.in).nextInt();
            }
        System.out.printf("Năm sinh: ");
        year=sc.nextInt();
            while (year<1){
                System.out.println("Nhập lại năm sinh: ");
                year=new Scanner(System.in).nextInt();
            }
        Calendar birthday=Calendar.getInstance();
        birthday.set(year,month-1,day);
        int namsinh=birthday.get(Calendar.YEAR);
        int thangsinh=birthday.get(Calendar.MONTH);
        int ngaysinh=birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng sinh: "+ngaysinh+"/"+(thangsinh+1)+"/"+namsinh);
        Calendar cal=Calendar.getInstance();
        int thisYear= cal.get(Calendar.YEAR);
        System.out.println("Tuổi của bạn là: "+(thisYear-year));
        // dùng try catch đê xử lý lỗi if input 2f 3g...
        } catch (Exception ex){
            System.out.println("Lỗi chỉ nhập số");
            ex.printStackTrace();
        }
    }
}
