package tw.org.iii;

import sun.net.www.http.HttpCaptureOutputStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by iii-user on 2016/11/11.
 */
public class ppkingJavaClass45 {
    public  static  void main(String[] args){
        try{
            URL url = new URL("http://pdfmyurl.com/?url=http://www.gamer.com.tw");
            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            conn.connect();

            InputStream in = conn.getInputStream();
            FileOutputStream fout = new FileOutputStream("upload/gamer.pdf");
            //4096 設定一組記憶體給圖片or 檔案
            byte[] buf = new byte[4096]; int len;
            while ((len = in.read(buf))!=-1){
                fout.write(buf,0,len);
            }
            fout.flush();
            fout.close();
            in.close();

            System.out.println("Finish");
        }catch(Exception e){

        }
    }

}
