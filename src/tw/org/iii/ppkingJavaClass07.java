package tw.org.iii;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ppkingJavaClass07 {
    public static void main(String[] pptest){
        //2016.10.3 ->一
        int Year = 2017;
        int Month = 11;
        int Day = 21;
        int [] FindMonth = {4,0,1,4,-1,3,4,0,3,5,1,3};
        String[] Today = {"日","一","二","三","四","五","六"};



        int Date =  (Day+FindMonth[Month-1])%7;   //1:4 2:0 3:1 4:4 5:-1 6:3  7:4  8月:0  9月:3 10月:5 11:1   12:3
        System.out.println(Today[Date]);


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
