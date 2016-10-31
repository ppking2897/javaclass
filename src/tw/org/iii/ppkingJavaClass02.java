package tw.org.iii;

/**
 * Created by iii-user on 2016/10/31.
 */
public class ppkingJavaClass02 {
    public static void main(String[] pptest){
        float Var1 = 12 ;
        float Var2 = 12.3f;//小數點float若後面沒加上f則認為該值為double
        double Var3 = 10 , Var4 = 3;
        int Var5 = 10 , Var6 = 3;
        System.out.println(Var5/Var6);
        // double 0 / 0 NaN
        // double 10 / 0 infinity
        // double -10 / 0  -infinity
        // int 0 / 0 錯誤訊息
    }
}

