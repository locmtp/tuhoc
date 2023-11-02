public class bai26_String1 {
    public static void main(String[] args) {
        // khai báo đối tượng chuoi
        StringBuilder chuoi = new StringBuilder("Hello, ");
        chuoi.append("Have you question?");  // add last chuoi
        System.out.println(chuoi);
        // insert ( chèn add word vào chuỗi)
        chuoi.insert(5, " You");
        System.out.println(chuoi);
        // delete (star, end-1) xóa từ star to end-1
        chuoi.delete(5, 9);
        System.out.println(chuoi); // delete words you 5 to 9
        // reverse đảo ngược chuỗi
        StringBuilder a1=new StringBuilder("0123456789");
        System.out.println(a1.reverse());  //reverse thuộc class StringBuilder
        // length returns number of string
        int a;
        a = chuoi.length();
        System.out.println(chuoi.length());
        System.out.println(a);

        String qq = "i live in HCM city, it's so fun";
        // indexOf check vị trí xuất hiện first of word or string
        System.out.println(qq.indexOf("ve"));
        // lastindex returns last word or last string
        System.out.println(qq.lastIndexOf("fu"));

        // contains: Check chuỗi con
        String aa = ".mp3", bb = "Making my way.mp3";
        boolean checkmp3 = bb.contains(aa);
        if (checkmp3)
            System.out.println("find file mp3 in String");
        else
            System.out.println("Not found file mp3");

        // substring: take chuỗi con từ chuỗi ban đầu
        // substring(beginInDex, endIndex)
        String cc="Hello everyone",dd;
        dd=cc.substring(6);
        System.out.println(dd);

        // replace: thay thế old String  = new String
        String jj="I like go to out but i wanna go to bed", kk;
        kk=jj.replace("bed","out");
        System.out.println(jj+"\n"+kk);
        // replace first: thay thế chuỗi đầu tiên find
        String ll=jj.replaceFirst("I","You");
        System.out.println(ll);

        //trim: delete all khoảng trắng first and last
        String ab="       I'm crazy         ",ac;
        ac=ab.trim();
        System.out.println(ac);
        //không cố lệnh chỉ xóa khoảng trắng ở đầu hay cuối
        // xóa khoảng cách first
        String ik=ab.replaceAll("^\\s+", "");
        System.out.println(ik);
        //xóa khoảng cách last
        String kl=ab.replaceAll("\\s+$", "");
        System.out.println(kl);

        // Compare string dựa theo board ASII
         String acc="KNlkcIan", acb="knlkcian";
         int x=acc.compareTo(acb); // if two Strings = nhau result =0
         System.out.println(x);
         x=acc.compareToIgnoreCase(acb); // bỏ qua Uppercase
        System.out.println(x);
        System.out.println("---------------------------------------------");

        // spit tách chuỗi
        String q21="Hello, everyone, i'm loc";
        String[] mang= q21.split(", ");
        // duyệt mảng
        for (int i=0;i<mang.length;i++){
            System.out.println(mang[i]);
        }
        // chuyển all thành chữ thường
        String a2=q21.toLowerCase();
        System.out.println(a2);
        // chuyển all thành chữ hoa
        String a3=q21.toUpperCase();
        System.out.println(a3);

        // tách strings thành từng kí tự lẻ, cho vào mảng
        String a4="loc@gmail";
        char[] manga=a4.toCharArray();
        for (int i1=0;i1<manga.length;i1++){  // run trước sau đó mới check điều kiện
            System.out.println(manga[i1]);
        }


    }
}
