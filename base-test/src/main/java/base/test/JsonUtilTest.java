package base.test;

import base.util.JsonUtil;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by base on 2015/10/24.
 */
public class JsonUtilTest {

    public static void main(String []args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "111");
        map.put("age", 10);
        map.put("sex", "男");
        map.put("weight", 70);

        Gson gson = new Gson();
        Person person = gson.fromJson(JsonUtil.objToJson(map), Person.class);
        System.out.println(person.toString());
    }
}
