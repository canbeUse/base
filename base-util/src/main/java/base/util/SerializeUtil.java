package base.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by base on 2015/7/2.
 */
public class SerializeUtil {

    public static byte[] objectToBytes(Object obj) {
        byte[] result = null;
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;

        try{
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.flush();
            result = baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != oos){
                try{
                    oos.close();
                    baos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
