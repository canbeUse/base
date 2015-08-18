package base.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by working on 2015-08-14.
 */
public class TestMain {

    @Test
    public void testStringLength(){
        List<String> slist = new ArrayList<>();
        slist.add("abc");
        slist.add("123");
        slist.add("一二三");
        slist.add("abc一二三");

        for(String s: slist){
            System.out.println(s.length());
        }
        slist.add("test git ");
    }
}

