package base.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by base on 2015-10-21.
 */
public class StringTest {

    public static int unicode2ascii(String unicodeStr){
        int ascii = 0;
        Pattern pattern = Pattern.compile("\\&\\#(\\d+)");

        StringBuilder sb = new StringBuilder();
        Matcher m =pattern.matcher(unicodeStr);

        while (m.find()){
            sb.append((char)Integer.valueOf(m.group(1)).intValue());
        }
        String asciiStr =  sb.toString();
        asciiStr = asciiStr.replace("&#", "").replace(";", "");
        if (asciiStr != null && "".equals(asciiStr)) {
            ascii = Integer.parseInt(asciiStr);
        }
    return ascii;
    }

    public static void str2char(String str){
        char[] cs = str.toCharArray();
        for (char c : cs){
            System.out.println((int) c);
        }
    }

    public static int char2ASCII(char c) {
        return (int) c;
    }

    public static void main(String [] args) {

        String str = "是你的吗";

        str2char(str);
//        System.out.println(char2ASCII(str));
//        System.out.println(str.length());
    }
}
