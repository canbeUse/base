package base.test;

import main.java.com.UpYun;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by base on 2015-10-21.
 */
public class UpImageTest {

    private static final String BUCKET_NAME = "*****";
    private static final String OPERATOR_NAME = "*****";
    private static final String OPERATOR_PWD = "*****";
    private static final String IMG_DIR = "/**/**/";
    /**上传图片
     * @param fileName
     * @param datas
     * @return
     */
    public static Map<String,String> imageUpload(String fileName,byte[] datas){

        Map<String, String> result = new HashMap<String, String>();
        UpYun upYun = new UpYun(BUCKET_NAME, OPERATOR_NAME, OPERATOR_PWD);

        String filePath = IMG_DIR + fileName;
        // 例2：采用数据流模式上传文件（节省内存）,自动创建父级目录
        boolean upResult = upYun.writeFile(filePath, datas, true);
        if(upResult) {
            result.put("message", "上传图片成功！");
        }else{
            result.put("message", "上传图片失败！");
        }

        return result;
    }

    public static void main(String[] args ){
        File file = new File("F:\\workspace\\IDEA\\base\\base-test\\src\\main\\resources\\11111.png");
        FileInputStream fs = null;
        BufferedInputStream bis = null;
        ByteArrayOutputStream out = null;
        try {
            fs = new FileInputStream(file);
            bis = new BufferedInputStream(fs);
            out = new ByteArrayOutputStream(1024);

            byte[] temp = new byte[1024];
            int size = 0;
            while ((size = bis.read(temp)) != -1) {
                out.write(temp, 0, size);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        byte[] content = out.toByteArray();
        imageUpload("201510211430.png",content);

        System.out.println("执行成功");
    }
}
