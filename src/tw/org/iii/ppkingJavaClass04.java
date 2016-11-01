package tw.org.iii;

public class ppkingJavaClass04 {
    public  static  void main(String[] pptest) {

        double doubleScore = Math.random();
                System.out.println(doubleScore);
                int intScore = (int) (doubleScore * 101);
                // int xxx * 出現數字 + 是否從0開始 由1開始就+1
                System.out.println(intScore);
                char Pass;
                if (intScore >= 90) {
                    Pass = 'A';
                } else {
                    if (intScore >= 80) {
                        Pass = 'B';
            } else {
                if (intScore >= 70) {
                    Pass = 'C';
                } else {
                    if (intScore >= 60) {
                        Pass = 'D';
                    }
                    else{
                        Pass = 'E';
                    }
                }
            }
            System.out.println(Pass);
        }
    }
}
