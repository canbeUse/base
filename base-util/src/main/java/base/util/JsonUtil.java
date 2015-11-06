package base.util;

import com.google.gson.Gson;

/**
 * Created by base on 2015/10/24.
 */
public class JsonUtil {

    private static Gson gson ;
    public static Gson getGson() {
        if (gson == null) {
            synchronized (JsonUtil.class) {
                if (gson == null) {
                    gson = new Gson();
                }
            }
        }
        return gson;
    }

    public static String objToJson(Object obj) {
        return getGson().toJson(obj);
    }
}