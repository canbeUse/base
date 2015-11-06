package base.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by base on 2015-08-05.
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
}
