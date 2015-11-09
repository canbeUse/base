package base.log4j;

import org.apache.log4j.Logger;

/**
 * Created by base on 2015-11-09.
 */
public class Log4jHelper {
    private Logger logger;
    public Log4jHelper(Logger logger){
        this.logger = logger;
        logger.debug("--------------->debug<---------------");
        logger.info("--------------->info<---------------");
        logger.warn("--------------->warn<---------------");
        logger.error("--------------->error<---------------");
    }
}
