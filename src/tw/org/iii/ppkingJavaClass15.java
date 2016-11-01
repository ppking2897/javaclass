package tw.org.iii;

public class ppkingJavaClass15 {
    public static void main(String[] pptest){
        int[][] a = new int [3][];
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[4];

        for (int[] v:a){
            for(int s : v ){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        int [] b = new int [] {1,2,3,4,5};
        int [] c = {1,2,3,4,5};
//        int [] d ;
//        d = {1,2,3,4,5};   必須要在宣告時順便給值
//        int [] e ;
//        e = new int [] {1,2,3,4,5};  宣告時沒給值 可以利用new int 新加入值
        for(int v:c){
            System.out.println(v);
        }
    }
}
