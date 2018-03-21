package com.ariix.myTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
	final static Logger logger = LoggerFactory.getLogger("LogbackTest.class");
	public static void main(String[] args) {
		logger.trace("trace");
        logger.debug("debug str");
        logger.info("info str");
        logger.warn("warn");
        logger.error("error");
	}
}
