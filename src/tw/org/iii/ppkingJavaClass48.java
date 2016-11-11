package tw.org.iii;

import javax.swing.text.Style;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by iii-user on 2016/11/11.
 */
public class ppkingJavaClass48 {
    public static void main(String [] args){
//        HashSet set = new HashSet();
        TreeSet set = new TreeSet();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        System.out.println(set.toString());
        System.out.println("-----");
        LinkedList list = new LinkedList();
        list.add(0,1);     //0
        list.add(0,2);          //1
        list.add(0,3);         //2
        list.add(0,4);          //3
        list.add(0,5);        //4
        System.out.println(list.toString());

    }
}
