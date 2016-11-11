package tw.org.iii;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

/**
 * Created by iii-user on 2016/11/11.
 */
public class ppkingJavaClass49 {
    public static void main(String [] args){
        //指定元素的型態避免無法比較 泛型
//        TreeSet<Integer> set = new TreeSet();
//        set.add(12);
//        set.add(23);
        HashMap<String,Object> map = new HashMap<>();
        map.put("name","ppking");
        map.put("gender", false);
        map.put("weight", 68);

        System.out.println(map.get("name"));
        System.out.println(map.get("gender"));
        System.out.println(map.get("weight"));
    }
}
