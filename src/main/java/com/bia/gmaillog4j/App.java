package com.bia.gmaillog4j;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
    
    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {
        
        logger.trace("trace message");
        
        logger.warn("warn message");
        
        logger.error("error message, a very long error message!");
        
        Thread.sleep(2000);
    }
}
