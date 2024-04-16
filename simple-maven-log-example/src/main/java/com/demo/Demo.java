package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
	
	/**
	 * https://mkyong.com/logging/logback-xml-example/
	 */

	private static final Logger log = LoggerFactory.getLogger(Demo.class);

	public static void main(String[] args) {
		System.out.println("Testing log");
		log.debug("Debug Demo");
		
	}

}
