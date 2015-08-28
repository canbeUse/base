package base.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by working on 2015-08-14.
 */
public class TestMain {

    @Test
    public void testPattern(){
        String mainbody = "<a href=\"https://www.baidu.com/\" >百度</a>";
//        String mainbody = "评价3回答-测试测试测试测试测试测试测试测试测试测试测试";
        Pattern pattern = Pattern.compile("(.*)((<a[^>]+href=[^>]+>[^<]*</a>)|((\\[IMG\\])(http|https|ftp)://([ \\S\t]*?)(\\[/IMG\\]))|(/<[\\s\\S]*>[\\s\\S]*</(.)*>|<[a-zA-Z](.)*>/g))(.*)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(mainbody);
        System.out.println(matcher.matches());
    }

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

    public int add(int x,int y){
        return x+y;
    }

    public class InnerClass{
        public int add(int x,int y){
            return (x+y)*2;
        }

        public int testAdd1(int x,int y){
            return add(x,y);
        }

        /**
         * 成员内部类访问外部类同名方法：
         * 外部类.this.成员变量
         * 外部类.this.成员方法
         */
        public int testAdd2(int x,int y){
            return TestMain.this.add(x, y);
        }
    }

    @Test
    public void testAdd(){
        //TestMain.InnerClass tmi = new TestMain.InnerClass();
        TestMain tm = new TestMain();
        TestMain.InnerClass tmi = tm.new InnerClass();
        int x =10,y=10;
        System.out.println("默认访问内部类方法："+tmi.testAdd1(x, y));
        System.out.println("访问外部类方法："+tmi.testAdd2(x, y));
    }
}

