package com.mphasis.logger;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;

/**
 * Creating the logger obj anf displaying the log message
 * Displaying the log message in the diff forms 
 * Also appending the into the file
 * 
 * @author saikiranmsk
 *
 */

public class DemoLogger {

	public static  Logger log=Logger.getLogger(DemoLogger.class);
	
	public static void main(String[] args) {
		/**
		 * Displaying the loginfo in  the priorityName-logMessage layout
		 */		
//		Layout layout=new SimpleLayout();
//		/**
//		 * Displaying the loginfo in the html Layout
//		 */
//		Layout layout2=new HTMLLayout();
//		/**
//		 * Displaying the loginfo in the pattern layout
//		 */ 
//		Layout layout3=new PatternLayout("%c [%M] - %l %m %n");
//		/**
//		 * appending the loginfo in the console
//		 */
//		Appender appendable=new ConsoleAppender(layout3);
//		/**
//		 * appending the loginfo in to the file
//		 */
//		try {
//			Appender fileappendable=new FileAppender(layout3, System.getProperty("user.dir")+"\\logfile\\loginfo.log");
//			log.addAppender(fileappendable);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//log.addAppender(appendable);
		
		log.debug("from debug");
		log.info("from info");
		log.warn("This is the info message");
		log.error("This is the error message");
		log.fatal("This is the fatal message");
	}
}
