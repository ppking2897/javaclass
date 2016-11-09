package tw.org.iii;

/**
 * Created by BiancaEN on 2016/11/8.
 */
public class ppkingJavaClass21 {
    public static void main(String[] args){
        String s1 = "ppking";
        String s2 = "ppking";
        String s3 = new String("ppking");
        String s4 = new String("ppking");
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
        System.out.println("----------");
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println("---");
        String s5 = s3;
        System.out.println(s3.concat("III"));
        System.out.println(s3);
        System.out.println("---");
        System.out.println(p1);

    }
}
class Pen extends Object {
    //@Override判斷是否真的改變了父類別的方法，沒改變成功會出現錯誤
    @Override
    public String toString() {
        return "Apple";
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
