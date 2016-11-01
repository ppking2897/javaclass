package tw.org.iii;


public class ppkingJavaClass08 {
    public static  void main(String[] ppTest){
        int i=0;
        //for (首次執行敘述句;執行前的判斷;執行後的敘述句)
        //執行前的判斷若空格不填，則為Ture 為無窮迴圈
        // for(;;) 無窮迴圈語法 ex: 伺服器判斷
        for ( m1();  ; System.out.println("------")){
            if (i>=10) break;
            System.out.println(i++);
        }
    }
    static void m1(){
        System.out.println("ppking");
        for(int i=0 ; i<10 ; i++){
            System.out.println(i);
        }
    }
}
