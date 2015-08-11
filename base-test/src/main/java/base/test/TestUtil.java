package base.test;

import base.domain.entities.User;
import base.util.HttpClientUtil;
import base.util.XmlUitl;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class TestUtil
{
    @Test
    public void testHttpClientUtil() {
        String urlsrc = null;
        try {
            urlsrc = HttpClientUtil.getHTML("http://www.baidu.com", "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(urlsrc);
    }

    @Test
    public void testXmlUtil() {
        User user = new User();//User需添加注释：@XmlRootElement
        user.setuId(1);
        user.setuName("111");
        user.setuPassword("111");
        try {
            System.out.println(XmlUitl.objectToXml(user, User.class));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
