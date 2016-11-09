package tw.org.iii;

/**
 * Created by BiancaEN on 2016/11/8.
 */
public class ppkingJavaClass23 {
    public static void main(String[] args){
        System.out.println(Person.getCounter());
        Person p1 = new Person("Brad");
        Person p2 = new Person("Brad");
        Person p3 = new Person("Brad");
        System.out.println(Person.getCounter());
        p1.sayYa();
    }
}
class Person{
    String name;
    static private int counter;
    Person(String name){
        //將輸入的名字丟入，並計算幾個字
        this.name = name;
        counter++;
    }
    void sayYa(){
        System.out.println(name + ":Ya");
    }
    static int getCounter(){
        return counter;
    }
}