package tw.org.iii;


import java.util.Random;

public class ppkingJavaClass12 {
    public static void main(String[] pptest){
        //陣列型別固定  長度=>初始化=>固定
//        int[] a;
        //看到new就已經產生一個物件實體    建構式=>物體的初始化
//        a = new int[3];//未給值，但new後一定有值為0
        //直接將裡面的值全部提領
//        for (int v: a){
//            System.out.println(v);
//        }
            int p1,p2,p3,p4,p5,p6;
            p1=p2=p3=p4=p5=p6=0;
            for( int i = 1 ; i<=100 ; i ++){
               double RandomNumber =  Math.random();
               int Six = (int)(RandomNumber * 6);
                switch(Six){
                    case 0 : p1++; break;
                    case 1 : p2++; break;
                    case 2 : p3++; break;
                    case 3 : p4++; break;
                    case 4 : p5++; break;
                    case 5 : p6++; break;
                }
            }
            System.out.println("1 點出現 " + p1 +"次");
            System.out.println("2 點出現 " + p2 +"次");
            System.out.println("3 點出現 " + p3 +"次");
            System.out.println("4 點出現 " + p4 +"次");
            System.out.println("5 點出現 " + p5 +"次");
            System.out.println("6 點出現 " + p6 +"次");
    }
}
