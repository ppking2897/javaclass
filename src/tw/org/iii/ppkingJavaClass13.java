package tw.org.iii;


public class ppkingJavaClass13 {
    public static void main(String[] pptest){
        int [] p = new int[6];

        for(int i=0 ; i<100000 ; i++){
            int point = (int)(Math.random()*9);//0-8
            p[point>=6?point-3:point]++; //大於六 :7-8-9  將其丟入 4 5 6的出現次數內
        }
        for(int i=0 ; i<p.length ; i++){
            System.out.println((i+1)+"點出現"+p[i]+"次");
        }
    }
}
