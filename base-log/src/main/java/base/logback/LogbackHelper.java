package base.logback;


import org.slf4j.Logger;

/**
 * Created by pan on 2015-11-11.
 */
public class LogbackHelper {
    private Logger logger;
    public LogbackHelper(Logger logger){
        this.logger = logger;
        logger.debug("--------------->debug<---------------");
        logger.info("--------------->info<---------------");
        logger.warn("--------------->warn<---------------");
        logger.error("--------------->error<---------------");
    }
}
