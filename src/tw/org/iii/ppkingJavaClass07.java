package tw.org.iii;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class ppkingJavaClass07 {
    public static void main(String[] pptest){
        int year = 2016;
        int month = 2 ;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The date is 31");
                break;
            case 2:
                if(year % 4 == 0 ) {
                    if (year % 100 != 0) {
                        if(year % 400 ==0) {
                            System.out.println("The date is 29");
                        }
                    }
                    else {
                        System.out.println("The date is 29");
                    }
                }
                else {
                    System.out.println("The date is 28");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The date is 30");
                break;
        }

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
