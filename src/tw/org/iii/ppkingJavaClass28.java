package tw.org.iii;

/**
 * Created by BiancaEN on 2016/11/9.
 */
public class ppkingJavaClass28 {
    public static void main(String[] args){
        Bird b1 = new Bird();
        try{
            b1.setLeg(-1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Bird {
    private  int leg;
    void setLeg(int n) throws Exception{
        if (n<0 || n>2){
            throw new RuntimeException();
        }
        leg = n ;
    }
}
