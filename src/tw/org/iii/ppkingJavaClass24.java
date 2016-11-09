package tw.org.iii;

/**
 * Created by BiancaEN on 2016/11/8.
 */
public class ppkingJavaClass24 {
    public static void main(String[] args){
        Brad251 obj1 = new Brad251();

        Brad252 obj2 = new Brad253();
        Brad252 obj3 = new Brad254();
        obj2.m1();
        obj3.m2();

    }
}
class Brad251 {
    int a;
    void m1(){}
    void m2(){}
}
//抽象類別  此類別不得new出一個物件  只能extends它  不一定要照他內容實作
//當中有abstract的可以重新定義實作方法
abstract class Brad252 {
    int a;
    void m1(){}
    abstract void m2();
}
class Brad253 extends Brad252 {
    void m2(){System.out.println("Brad253:m2(){}");}
}
class Brad254 extends Brad252 {
    void m2(){System.out.println("Brad254:m2(){}");}
}