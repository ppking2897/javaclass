package tw.org.iii;

public class ppkingJavaClass11 {
    public static void main(String[] ppktest){
//        int i = 0;
//        //至少會有一次
//        do {
//            System.out.println(i++);
//        }while (i<10);
        int i = 0 , sum=0 , n = 100;
        while(i<=n){
            sum = sum + i;
            i++ ;
        }
        System.out.println("1+2+3+.....+n ="+ sum );
    }
}
