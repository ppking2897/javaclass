package tw.org.iii;

import java.sql.SQLType;

/**
 * Created by BiancaEN on 2016/11/8.
 */
public class ppkingJavaClass22 {
    public static void main(String[] args){
        //依照所設計的輸入你要的型別
        //TWId()  TWId(true) 產生男性身分證  TWId('w',true) 產生金門地區　男生
        TWId id1 = new TWId('W',true);
        System.out.println(id1.getId());
        if (TWId.isCheckOK("F127282897")){
            System.out.println("ok");
        }else{
            System.out.println("XX");
        }
    }
}
