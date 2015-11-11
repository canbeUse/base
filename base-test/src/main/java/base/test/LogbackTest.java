package base.test;

import base.logback.LogbackHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by pan on 2015-11-11.
 */
public class LogbackTest {

    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        new LogbackHelper(logger);
    }
}
