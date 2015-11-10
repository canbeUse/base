package base.just.test;

/**
 * Created by pan on 2015-11-10.
 */
//Static使用
//static成员不可访问非static成员
//this，super不允许出现在static方法中
//程序直接访问一个实例/类Field，可省略this./类名.
public class InvilidTest {

    String name;
    int age;
    //初始化块
    {
        name = "haha";
        age = 10;
    }

    //静态初始化块，不可含有非静态成员
    static{
        //name = "haha";//错误，name是非静态成员
        //age = 10;  //错误，age是非静态成员
        eat();  //正确，省略了类名StaticTest.
    }

    public static void eat(){
    }

    public static void main(String[] args)
    {
        InvilidTest s = new InvilidTest();
        System.out.println("姓名:"+s.name+",年龄:"+s.age);
    }
}