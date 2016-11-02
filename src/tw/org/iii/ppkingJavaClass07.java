package tw.org.iii;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ppkingJavaClass07 {
    public static void main(String[] pptest){
        //2016.10.3 ->一
        int Year = 2003;
        int Month = 12;
        int Day = 14;         //1 2 3 4 5 6 7 8 9 0 1 2
        int [] FindMonth2016 = {6,2,2,5,0,3,5,1,4,6,2,4};// 2016
        String[] Today = {"日","一","二","三","四","五","六"};

//        int Date =  (Day+FindMonth2016[Month-1])%7;   //1:4 2:0 3:1 4:4 5:-1 6:3  7:4  8月:0  9月:3 10月:5 11:1   12:3
//        System.out.println(Today[Date]);
        int x = 0;
        x = FindMonth2016[Month-1]+Year+(Year/4)-(Year/100)+(Year/400);
        System.out.println(x);
        System.out.println(Day);
        x = x + Day;
        System.out.println(x);


        if( (Month<3)  && (Year % 4)==0){
            x=x-1;
            if((Year%100)==0) x++;
            if((Year%400)==0) x--;
        }

        x = x %7 ;
        System.out.println(x);
        System.out.println(Today[x]);
//        int year = 2016;
//        int month = 2 ;
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("The date is 31");
//                break;
//            case 2:
//                if(year % 4 == 0 ) {
//                    if (year % 100 != 0) {
//                        if(year % 400 ==0) {
//                            System.out.println("The date is 29");
//                        }
//                        else {
//                            System.out.println("The date is 28");
//                        }
//                    }
//                    else {
//                        System.out.println("The date is 28");
//                    }
//                }
//                else {
//                    System.out.println("The date is 28");
//                }
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("The date is 30");
//                break;
//        }

        //int b = 10 ;  //final int b = 10 ; 不會改變 就可以直接以變數套入case
        // byte short int char 可以使用switch
//        switch (a){
//            case 1:
//                System.out.println("A");
//                break;
//            case 10:
//                System.out.println("B");
//                break;
//            case 100:
//                System.out.println("C");
//                break;
//            default:
//                System.out.println("D");
//                break;
//        }

    }
}
