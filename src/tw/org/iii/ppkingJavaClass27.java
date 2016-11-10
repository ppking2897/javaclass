package tw.org.iii;

/**
 * Created by BiancaEN on 2016/11/8.
 */
public class ppkingJavaClass27 {
    public static void main(String[] args){
        int a = 10, b = 3;
        int[] d = {0,1,2,3};
        try {
            int c = a / b;
            System.out.println(d[0]);
        }catch (ArithmeticException ae){
            System.out.println("OK1");
        }catch (RuntimeException ae){
            System.out.println("OK2");
        }

        System.out.println("Game Over");
    }
}
