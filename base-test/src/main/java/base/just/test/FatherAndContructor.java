package base.just.test;

/**
 * Created by base on 2015-11-10.
 */
/**
 * 考点：构造函数的继承和调用问题
 * 输出顺序：Father无参构造函数
 *			 Child无参构造函数
 *			 Father无参构造函数
 *			 Child有参构造函数<---
 */

public class FatherAndContructor
{
    public FatherAndContructor(){
        System.out.println("Father无参构造函数");
    }
    public FatherAndContructor(String str){
        System.out.println("Father有参构造函数 "+str);
    }
    public static void main(String[] args){
        Child c = new Child();
        Child ch = new Child("<---");
    }
}

class Child extends FatherAndContructor{
    public Child(){
        System.out.println("Child无参构造函数");
    }
    public Child(String str){
        System.out.println("Child有参构造函数 "+str);
    }
}