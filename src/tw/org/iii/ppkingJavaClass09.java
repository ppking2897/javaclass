package tw.org.iii;


public class ppkingJavaClass09 {
    public static void main(String[] pptest) {
        for (int k = 0; k < 2; k++) {
            for (int j = 1; j <= 9; j++) {
                for (int i = 2; i <= 5; i++) {
                    int newi = i + k * 4 ;
                    int r = newi * j;
                    System.out.print(newi + " x " + j + " = " + r + "\t");
                }
                System.out.println();
            }
            System.out.println("----------------");
        }
    }
}