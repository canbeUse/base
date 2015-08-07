package base.util;

/**
 * Created by working on 2015/7/2.
 */
public class StringUtil {

    public static boolean isNullOrEmpty(String value) {
        return value == null || "".equals(value);
    }

    /**
     * 全角字符串转半角
     * @param value 任意字符串
     * @return 半角字符串
     */
    public static String toDBC(String value)
    {
        char[] c = value.toCharArray();
        for (int i = 0; i < c.length; i++)
        {
            //12288：全角空格；32：半角空格
            if (c[i] == 12288)
            {
                c[i] = (char) 32;
                continue;
            }
            /**
             * 半角字符
             * 32    空格 65248+32=65280
             * 33-47    标点
             * 48-57    0~9
             * 58-64    标点
             * 65-90    A~Z
             * 91-96    标点
             * 97-122    a~z
             * 123-126  标点 65248 + 126 = 65374
              */
            if (c[i] > 65280 && c[i] < 65375)
                //全角字符 - 65248 = 半角字符
                c[i] = (char) (c[i] - 65248);
        }
        return new String(c);
    }
}
