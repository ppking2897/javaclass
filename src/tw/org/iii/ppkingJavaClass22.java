package tw.org.iii;

/**
 * Created by BiancaEN on 2016/11/8.
 */
public class ppkingJavaClass22 {
    public static void main(String[] args){
        TWId id1 = new TWId();
        System.out.println(id1.getId());
        if ( TWId.isCheckOK(id1.getId())){
            System.out.println("OK");
        }else{
            System.out.println("XX");
        }

    }
}
