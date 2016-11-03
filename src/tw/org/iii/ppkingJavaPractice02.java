package tw.org.iii;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by iii-user on 2016/11/3.
 */
public class ppkingJavaPractice02 {
    public static void main(String [] args){
        int [] number = {70,80,31,37,10,1,48,60,33,80};
        int [] number2 = new int [number.length];
        Arrays.sort(number);
        for(int s:number){
            System.out.println(s);
        }
        System.out.print("--------------");
        System.out.println();
        int j = number.length-1;
        for(int i = 0 ; i<number.length ; i++) {
            number2[j] = number[i];
            j--;
        }
        for(int v:number2){
            System.out.println(v);
        }
        System.out.print("--------------");
        System.out.println();
        int findedNumber = 11 ;
        //找不到的數字索引數值為你輸入的數字跟你要找的數字中間
        //例如要找11為陣列中10 跟 31 之間內，所以在第二個索引值跟第三個索引值之間
        //就變成  -2-1=-3
        int assult = Arrays.binarySearch(number,findedNumber);
        System.out.println(assult);
    }
}
