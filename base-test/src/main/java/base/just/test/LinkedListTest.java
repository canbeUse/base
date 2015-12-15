package base.just.test;

import java.util.LinkedList;

/**
 * Created by Doing on 2015/12/10.
 */
public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list.get(1));
        list.removeFirstOccurrence(4);
    }
}