package tw.org.iii;

import sun.plugin2.message.JavaObjectOpMessage;

import javax.swing.*;

/**
 * Created by iii-user on 2016/11/10.
 */
public class GuessNumber {
    public static void main(String [] args) {
        //1. 產生謎底
        String answer = creatAnswer(6);
        System.out.println(answer);
        //2. 開始猜
        boolean isWINNER = false;
        for (int i = 0; i < 3; i++) {
            String guess = JOptionPane.showInputDialog("輸入答案:");
            String result = checkAB(answer, guess);

            JOptionPane.showMessageDialog(null, result);
            if (result.equals("3A0B")){
                isWINNER =  true ;
                break;
            }
        }
        if(isWINNER){
            JOptionPane.showMessageDialog(null,"Congradulation");
        }
        else{
            JOptionPane.showMessageDialog(null,"Woring Anwser Correct Answer is "+answer);
        }
    }
    static String creatAnswer(int n){
        int [] Poker = new int [n];
        for(int i = 0 ; i<Poker.length ; i++){
            Poker[i] = i ;
        }
        //洗牌
        for(int j = Poker.length-1 ; j>=0 ; j--) {
            int temp = (int) (Math.random() * j);
            int Add = 0;
            Add = Poker[j];
            Poker[j] = Poker[temp];
            Poker[temp] = Add ;
        }
        String ret = "";
        for(int v:Poker) ret += ret ;
        return ret ;
    }
    static String checkAB(String  a , String g){
        int A , B ;  A = B = 0 ;
        for(int i = 0 ; i<a.length() ; i ++){
            if(g.charAt(i)==a.charAt(i)){
                A++;
            }
            else if(a.indexOf(g.charAt(i)) != -1){
                B++;
            }

        }
        return A+"A"+B+"B";
    }
}
