package base.test;

import base.log.LogHelper;
import org.apache.log4j.Logger;

/**
 * Created by base on 2015-08-07.
 */
public class LogTest {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(LogTest.class);
        new LogHelper(logger);
    }
}
