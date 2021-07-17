package com.hu;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
    @Test
    public void testLog4j(){
        Logger logger = Logger.getLogger(Log4jTest.class);
        logger.debug("debug log");
        logger.error("error log");
        logger.warn("warn log");
        logger.info("info log");
    }
}
