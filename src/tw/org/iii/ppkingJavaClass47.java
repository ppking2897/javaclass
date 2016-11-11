package tw.org.iii;

import java.io.File;
import java.io.IOException;

/**
 * Created by iii-user on 2016/11/11.
 */
public class ppkingJavaClass47 {
    public static void main(String[] args){
        try {
            MultipartUtility mu = new MultipartUtility(
                    "http://10.2.24.136/ppking02.php","utf-8");
            mu.addFilePart("upload",new File("upload/gamer.pdf"));
            mu.finish();
            System.out.println("Upload OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
