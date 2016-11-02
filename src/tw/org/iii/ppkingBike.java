package tw.org.iii;

//同個檔名可以宣告多種類別，但命名沒有public，只能有一種public後面名稱為檔名
public class ppkingBike {
    // Member : 成員 > 屬性 / 方法
    // private : 封裝  只能利用方法存取 由方法對屬性做改變的動作
    // public > protected > <none> > private
    private double speed;

    ppkingBike() {
        System.out.println("Bike()");
    }
    ppkingBike(int gear){
        System.out.println("Bike(int)");
    }
    ppkingBike(double gear){
        System.out.println("Bike(double)");
    }

    void upSpeed(){
        speed = speed<1?1:speed*1.2;
    }
    //Override 有參數進入 參數的個數，型別的不同
    void upSpeed(int gear){
        speed = speed<1?1:speed*(1.2+gear);
    }
    void upSpeed(double gear){
        speed = speed<1?1:speed*(gear);
    }
    void downSpeed(){
        speed = speed<1?0:speed*0.7;
    }
    double getSpeed(){
        return speed;
    }
}
//其他類別看不到
//class Bike1
