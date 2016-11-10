package tw.org.iii;

import java.io.File;

/**
 * Created by BiancaEN on 2016/11/9.
 */
public class ppkingJavaClass29 {
    public static void main(String [] args){
        File dir1 = new File("dir1");
        //判斷是否有在路徑目錄內
        if(dir1.isDirectory()){
            File[] sub = dir1.listFiles();
            for ( File sfile : sub){
                System.out.println(sfile.getName());
            }
        }
        File[] roots = File.listRoots();
        for (File root :roots){
            //目錄底下的絕對路徑
            System.out.println(root.getAbsolutePath());
        }
    }
}
