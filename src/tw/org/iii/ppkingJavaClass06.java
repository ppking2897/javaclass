package tw.org.iii;

public class ppkingJavaClass06 {
    public static void main(String[] pptest){
        int a = 10 , b = 3 ;
        //& 會前後都做出結果再去比較 && 只要前面條件不符合就跳出
        if (++a <= 10 && b-- >=3){
            System.out.println("OK:a="+a+",b = "+ b);
        }
        else{
            System.out.println("XX:a="+a+",b = "+ b);
        }
    }
}
