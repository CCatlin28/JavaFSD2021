package com.christycatlin.connections;

import org.apache.log4j.*;
import org.apache.log4j.helpers.DateLayout;
import org.apache.log4j.spi.LoggingEvent;


import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;


public class Logging {
private static final Logger logger = LogManager.getLogger(Logging.class);

    public static int log(int count) throws IOException {
        boolean append = true;
        FileHandler handler = new FileHandler("log4j2.log", append);
        FileAppender fileAppender = new FileAppender();
        fileAppender.setThreshold(Level.INFO);
        fileAppender.setFile("com/christycatlin/connections/log4j2");
        fileAppender.setLayout(new PatternLayout("%d{dd MMM yyyy HH:mm:ss,SSS}"));
        fileAppender.activateOptions();
        LogManager.getRootLogger().addAppender(fileAppender);
        logger.debug("Hello this is a debug message");
        logger.info("Hello this is a info message");

        count++;
        return count;
    }



}
