package base.util;

import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by working on 2015-08-05.
 */
public class XmlUitl {
    public static <T> String objectToXml(T t, Class<T> clazz) throws JAXBException {
        Writer writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(clazz);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(t, writer);
        return writer.toString();
    }

    public static <T> T xmlToObject(String xml, Class<T> clazz)
            throws IllegalAccessException, InstantiationException, JAXBException {
        if (StringUtil.isNullOrEmpty(xml)) {
            return clazz.newInstance();
        }
        StringReader xmlString = new StringReader(xml);
        InputSource source = new InputSource(xmlString);
        JAXBContext jc = JAXBContext.newInstance(clazz);
        Unmarshaller u = jc.createUnmarshaller();
        return (T) u.unmarshal(source);
    }
}
