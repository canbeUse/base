package base.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Created by base on 2015-11-10.
 */
public class GenericUtil {
    /**
     * 获取32位的随机字符串
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 获取系统的换行符
     */
    public static String getLineSeparator(){
        return System.getProperty("line.separator");
    }

    /**
     * 根据用户名和密码进行加密
     * @param name 用户名
     * @param pwd  密码
     * @return 加密后的密码
     */
    public static String encrypt(String name, String pwd){
        int nameHash = name.hashCode();//盐值
        StringBuilder result = new StringBuilder();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bs = md.digest(pwd.getBytes());

            for(byte b:bs){
                int tmp = b + nameHash;
                int num = tmp & 0xff;
                if(num<16){
                    num+=16;
                }
                String numHex = Integer.toHexString(num);
                result.append(numHex);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("加密失败: "+e.getMessage());
        }

        return result.toString();
    }
}
