package tw.org.iii;


public class ppkingJavaClass17 {
    public static void main(String [] args){
//        int a 要給初始值
        ppkingClass171 b1 = new ppkingClass171();
        System.out.println(b1.getA());
        System.out.println("Game Over");
    }
}
//建構式 初始化自己之後就不會再呼叫
class ppkingClass171{
    int a ; //class 內的為成員  會自動初始為0
    ppkingClass171(){
        a = 12;
        System.out.println("ppkignClass171");
    }
    int getA(){
        return  a;
    }
}
