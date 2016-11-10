package tw.org.iii;

public class ppking16Bike {
    public static void main(String[] pptest){
        ppkingBike b1 = new ppkingBike();
        ppkingBike b2 = new ppkingBike();
        ppkingBike b3 = new ppkingBike();
        System.out.println(b1.getSpeed());
        System.out.println("-------");
        b1.upSpeed();
        b1.upSpeed();
        b1.upSpeed();
        System.out.println(b1.getSpeed());
        System.out.println("-------");
        System.out.println(b2.getSpeed());
        //long v2 = 4 ;long 容量大於int 所以無法自動轉 若物件內有double
        // 或跟long容量一樣
        // 則會自動進入double的程式內執行
        byte v2 = 4 ;
        b2.upSpeed(v2);
        b2.upSpeed(v2);
        b2.upSpeed(v2);
        System.out.println(b2.getSpeed());
        System.out.println("-------");
        System.out.println(b3.getSpeed());
        b3.upSpeed(4.0);
        b3.upSpeed(4.0);
        b3.upSpeed(4.0);
        System.out.println(b3.getSpeed());
    }

}
