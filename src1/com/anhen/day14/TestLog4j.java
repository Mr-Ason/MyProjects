package com.anhen.day14;
/*  D:/logs   文件夹
 * */
import org.apache.log4j.Logger;

public class TestLog4j {

	public static void main(String[] args) {
		Logger logger = Log4j.logger;
		logger.error("错误日志");
		logger.info("日常日志");
	}

}
class Log4j{
	public static Logger logger = Logger.getLogger(TestLog4j.class);
}