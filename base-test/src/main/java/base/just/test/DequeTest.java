package base.just.test;

import java.util.*;

/**
 * Created by base on 2015-11-10.
 */
public class DequeTest {
    public static void main(String[] args) {
        //当成栈使用,后进先出
        Deque<String> deque = new ArrayDeque<String>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        deque.push("d");
        String popstr1 = deque.pop();
        String popstr2 = deque.pop();
        System.out.println("deque:"+deque+",popstr1:"+popstr1+",popstr2:"+popstr2);

        //当成队列使用
        deque.offer("1");
        deque.offer("2");
        deque.offer("3");
        String pollstr = deque.poll(); //出队时上述栈仍有数值a,b,转化为队列时b为队列首，栈的后进优先级高
        String peekstr = deque.peek();//取队列第一个元素，不出栈
        System.out.println("deque:"+deque+",pollstr:"+pollstr+",peekstr:"+peekstr);
    }
}