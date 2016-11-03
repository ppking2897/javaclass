package tw.org.iii;

/**
 * Created by iii-user on 2016/11/3.
 */
//費式數
public class ppkingJavaPractice {
    public static void main(String [] aregs){
//        0 1 1 2 3 5 8 13 21 34 55 89
        int count  = 15 ;
        int [] number = new int [count];
        for(int i =0 ; i<count ; i++){
            number[i]=i;
        }
        for(int n = 2 ; n<count ; n++) {
            number[n] = number[n - 1] + number[n - 2];
        }
        for(int v:number)
        System.out.println(v);



    }
}
