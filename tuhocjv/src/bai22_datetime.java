import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        // take day month years
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current year "+year);
        System.out.println("Today is month "+(month+1));
        System.out.println("Today is day "+day);
        // set the desired day, month, year
        cal.set(Calendar.YEAR,2003);
        cal.set(Calendar.MONTH,6); // month max is 11
        cal.set(Calendar.DAY_OF_MONTH,15);
        int birthyear=cal.get(Calendar.YEAR);
        int birthmonth=cal.get(Calendar.MONTH);
        int birthday=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("My birthday is "+birthday+"/"+birthmonth+"/"+birthyear);
        // Xuất định dạng ngày tháng năm sinh
        SimpleDateFormat dinhdang= new SimpleDateFormat("dd/MM/yyyy hh/mm/ss a");
        // create 1 đối tượng date để get time đối tượng trong cal
        Date d= cal.getTime();
        String formartdate=dinhdang.format(d);
        System.out.println(formartdate);
    }
}
