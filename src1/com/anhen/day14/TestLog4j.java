package com.anhen.day14;
/*  D:/logs   �ļ���
 * */
import org.apache.log4j.Logger;

public class TestLog4j {

	public static void main(String[] args) {
		Logger logger = Log4j.logger;
		logger.error("������־");
		logger.info("�ճ���־");
	}

}
class Log4j{
	public static Logger logger = Logger.getLogger(TestLog4j.class);
}