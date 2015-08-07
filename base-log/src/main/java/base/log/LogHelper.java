package base.log;


import org.apache.log4j.Logger;

public class LogHelper
{
    private Logger logger;
    public LogHelper(Logger logger)
    {
        this.logger = logger;
        logger.debug("--------------->debug<---------------");
        logger.info("--------------->info<---------------");
        logger.warn("--------------->warn<---------------");
        logger.error("--------------->error<---------------");
    }
}
