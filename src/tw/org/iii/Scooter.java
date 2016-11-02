package tw.org.iii;

public class Scooter extends ppkingBike{
    Scooter() {
        // super(); 父類別
        super(2.2);//呼叫父類別內的方法，看是否要輸入參數
        System.out.println("Scooter()");
    }
}
