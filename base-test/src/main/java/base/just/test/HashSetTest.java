package base.just.test;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by pan on 2015-11-10.
 */
public class HashSetTest {

    public static void main(String[] args) {
        //此处参数值若不是2^n，则自动转化为大于参数的最小2^n，即此处会长度会自动转化为4。
        HashSet<String> hashS = new HashSet<String>(3);
        //和HashSet存储机制一样，额外增加一个链表存储元素的顺序
        LinkedHashSet<String> linkedHS = new LinkedHashSet<String>();
        //HashSet(int initialCapacity, float loadFactor)初始容量，负载系数（超过则rehash重哈希）。
        //负载系数越小，内存消耗越多，越大则性能越差。
        //HashSet<String> hashI = new HashSet<>(3,0.8);
        hashS.add("a");
        hashS.add("b");
        hashS.add("c");
        hashS.add("d");
        //不会产生越界，自动生成长度为8的另一数组，先前创建长度为4的数组便成为垃圾。
        hashS.add("e");

        linkedHS.add("1");
        linkedHS.add("2");
        linkedHS.add("3");
        linkedHS.add("4");

        //遍历HashSet
        for(String s: hashS){
            System.out.println(s);
        }
        //遍历LinkedHashSet
        for(String s: linkedHS){
            System.out.println(s);
        }
    }
}
