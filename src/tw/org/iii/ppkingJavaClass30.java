package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by BiancaEN on 2016/11/9.
 */
public class ppkingJavaClass30 {
    public static void main(String[] args){
        try {
            File file = new File("dir1/file1");
            long len = file.length();
            FileInputStream fin =
                    new FileInputStream(file);
            byte[] buf = new byte[(int)len];
            fin.read(buf);

            System.out.println(new String(buf));

            fin.close();
        }catch (FileNotFoundException fe){

        }catch (IOException fe){

        }
    }
}
