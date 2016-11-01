package tw.org.iii;

import java.util.Arrays;

public class ppkingJavaPoker {
    public static void main(String[] pptest){
        //洗牌
//        int [] poker = new int [52];
//        for(int i=0 ; i<poker.length ; i++){
//            int temp = (int)(Math.random()*poker.length);
//            boolean isReapt = false;
//            for(int j = 0 ; j<i ; j++) {
//                if (poker[j] == temp) {
//                    //重複
//                    isReapt = true;
//                    break;
//                }
//            }
//            if(isReapt){
//                i--;
//            }
//            else{
//                poker[i] = temp;
////                System.out.println(poker[i]);
//            }
//        }
////        System.out.println("------");
//        //發牌
//        int[] [] players = new int [4][13];
//        for(int i=0 ; i<poker.length; i++){
//            players[i%4][i/4] = poker[i];
//        }
//        //攤牌(理牌)
//        String[] suits = {"黑桃","愛心","方塊","梅花"};
//        String[] value = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//        for( int[] player : players){
//            Arrays.sort(player);
//            for( int Card : player){
//                System.out.print(suits[Card/13] + " " +  value[Card%13] + "  ");
//            }
//            System.out.println();
//            System.out.println("--------------------------");
//        }
        //撲克牌52張
        int [] Poker = new int [52];
        for(int i = 0 ; i<Poker.length ; i++){
            Poker[i] = i ;
        }
        //洗牌
        for(int j = 51 ; j>=0 ; j--) {
            int temp = (int) (Math.random() * j);
            int Add = 0;
            Add = Poker[j];
            Poker[j] = Poker[temp];
            Poker[temp] = Add ;
        }

        //發牌
        int[][] Players = new int [4][13];
        for(int i=0 ; i<Poker.length ; i++){
            Players[i%4][i/4] = Poker[i];
        }
//        for( int [] Player:Players){
//            for(int v:Player){
//                System.out.print(v + "   ");
//            }
//            System.out.println();
//            System.out.println("--------------");
//        }

        //理牌
        String [] Color = {"黑桃","愛心","方塊","梅花"};
        String [] Number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(int[] player :Players){
            Arrays.sort(player);
            for( int card :player){
                System.out.print( Color[card / 13] + Number[card % 13]  + " ");
            }
            System.out.println();
        }
    }
}
