package tw.org.iii;

public class ppkingJavaClass14 {
    public static void main(String[] pptest){
        int[][] a;
        a = new int [3][4];
//        System.out.println(a.length);
//        for(int i=0 ; i<a.length ; i ++){
//            for (int j=0 ; j<a[i].length ; j++ ){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[] v:a){
            for(int s : v ){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
