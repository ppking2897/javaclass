package tw.org.iii;

public class ppkingJavaClass06 {
    public static void main(String[] pptest){
        int a = 10 , b = 3 ;
        if (++a <= 10 && b-- >=3){
            System.out.println("OK:a="+a+",b = "+ b);
        }
        else{
            System.out.println("XX:a="+a+",b = "+ b);
        }
    }
}
