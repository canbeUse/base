package base.just.test;

/**
 * Created by base on 2015-11-10.
 */
interface Test{
    public int add(int x,int y);
}

class Father{
    public int add(int x,int y){
        return x+y;
    }
}

public class ImplandExtendTest extends Father implements Test{

    public static void main(String[] args) {
        int a=3,b=5;
        ImplandExtendTest ch = new ImplandExtendTest();
        System.out.println(a+"+"+b+"的和为:"+ch.add(a,b));
    }
}