package base.test;

import base.util.HttpClientUtil;

import java.io.IOException;

public class UtilTest
{
    public static void main( String[] args )
    {
        /**
         * zero-util
         */
        //HttpClientUtil
        String urlsrc = null;
        try {
            urlsrc = HttpClientUtil.getHTML("http://www.baidu.com", "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(urlsrc);

        //XmlUtil
//        User user = new User();//User需添加注释：@XmlRootElement
//        user.setuId(1);
//        user.setuName("111");
//        user.setuPassword("111");
//        try {
//            System.out.println(XmlUitl.objectToXml(user, User.class));
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
    }
}
