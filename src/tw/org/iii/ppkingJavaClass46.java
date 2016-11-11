package tw.org.iii;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by iii-user on 2016/11/11.
 */
public class ppkingJavaClass46 {
    public  static  void main(String[] args){
        try{
            URL url = new URL("http://localhost:63343/htdocs/ppking02.php");
            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            conn.connect();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            String line = br.readLine();
            br.close();

            System.out.println(line);
            System.out.println("Finish");
        }catch(Exception e){

        }
    }

}
