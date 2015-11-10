package base.just.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by base on 2015-11-10.
 */
public class DateFormatTest
{
    public static void main(String[] args)
    {
        Date date = new Date();

        //默认的格式(短日期和时间)和地区(US)
        DateFormat dfDefault = DateFormat.getInstance();
        //默认日期格式(短日期）和地区(US)
        DateFormat dfDefaultDate = DateFormat.getDateInstance();
        //满格式日期和中国地区
        DateFormat dfFullDateCN = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);

        //短格式的日期默认地区(US)
        DateFormat dfDateShort = DateFormat.getDateInstance(DateFormat.SHORT);
        //中格式的日期
        DateFormat dfDateMEDIUM = DateFormat.getDateInstance(DateFormat.MEDIUM);
        //长格式的日期
        DateFormat dfDateLONG = DateFormat.getDateInstance(DateFormat.LONG);
        //满格式的日期
        DateFormat dfDateFULL = DateFormat.getDateInstance(DateFormat.FULL);
        //满格式的日期和中国地区
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT,Locale.CHINA);

        System.out.println("默认的格式(短日期和时间)和地区(US)："+dfDefault.format(date));
        System.out.println("默认日期格式(短日期）和地区(US)："+dfDefaultDate.format(date));
        System.out.println("短格式的日期和默认地区(US)："+dfDateShort.format(date));
        System.out.println("中格式的日期和默认地区(US)："+dfDateMEDIUM.format(date));
        System.out.println("长格式的日期和默认地区(US)："+dfDateLONG.format(date));
        System.out.println("满格式的日期和默认地区(US)："+dfDateFULL.format(date));
        System.out.println("满日期和中国地区："+dfFullDateCN.format(date));
    }
}