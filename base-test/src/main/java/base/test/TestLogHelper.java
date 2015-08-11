package base.test;

import base.log.LogHelper;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by working on 2015-08-07.
 */
public class TestLogHelper {

    @Test
    public void testLogHelper(){
        Logger logger = Logger.getLogger(TestLogHelper.class);
        new LogHelper(logger);
    }
}
