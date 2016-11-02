package tw.org.iii;

/**
 * Created by iii-user on 2016/11/2.
 */
public class ppkingJavaHomeWork {
    public static void main(String[] aregs){
        for(int i = 2 ; i<=100 ; i++){
            int count = 0 ;
            int star = 0;
            for(int j = 1 ; j<=i ; j++){
                if(i % j == 0){
                    count ++;

                }
            }
            if(count>=3 && star==0){
                count = 0 ;
                star = 1;
                System.out.print(i+"\t"+"\t");
            }
            else {
                System.out.print(i+"*"+"\t"+"\t");
            }
            if(i%10==0){
                System.out.println();
            }
        }
    }
}
