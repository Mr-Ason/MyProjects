/**   
 * projectName: MyJava   
 * fileName: dsf.java   
 * packageName: com.anhen.mony   
 * date: 2018年3月26日下午5:26:12   
 * copyright(c) 2017-2020 xxx公司  
 */
package com.anhen.mony;

/**
 * @title: dsf.java
 * @package com.anhen.mony
 * @description: TODO
 * @author: LiuJiDong
 * @date: 2018年3月26日 下午5:26:12
 * @version: V1.0
 */
public class RMB {
	public static void main(String[] args) {
		String rmb = RMB.toRMB(10001.21);
		System.out.println(rmb);
	}

	public static String toRMB(double money) {
		char[] s1 = { '零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖' };
		char[] s4 = { '分', '角', '元', '拾', '佰', '仟', '万', '拾', '佰', '仟', '亿', '拾', '佰', '仟', '万' };
		// 这两句是为后面转换做字典准备
		String str = String.valueOf(Math.round(money * 100 + 0.00001));
		// 这是把参数money小数点后移2位，然后取整，即按照“分”为单位取整，再转为字符串型
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(str.length() - 1 - i) - '0';
			result = s1[n] + "" + s4[i] + result;
		}
		// 这一段是按照转换出来的字符串按位取数字，再按照上面的字典将其逐位翻译成汉字
		// 如“2011”就翻译成“贰仟零佰壹拾壹元”，“98700432.10”就是“玖仟捌佰柒拾零万零仟肆佰叁拾贰元壹角零分”——注：这里的人民币大写汉字，貌似有错误，请查阅相关资料更正
		// 以上的翻译可以看出，和我们平时的认读有差别，于是以下就是在将那些应该纠正的地方手动剔除以下。上述两个例子最后得到的结果应该是“贰仟零壹拾壹元整”，“玖仟捌佰柒拾万零肆佰叁拾贰元壹角整”
		result = result.replaceAll("零仟", "零");
		result = result.replaceAll("零佰", "零");
		result = result.replaceAll("零拾", "零");
		result = result.replaceAll("零亿", "亿");
		result = result.replaceAll("零万", "万");
		result = result.replaceAll("零元", "元");
		result = result.replaceAll("零角", "零");
		result = result.replaceAll("零分", "零");

		result = result.replaceAll("零零", "零");
		result = result.replaceAll("零亿", "亿");
		result = result.replaceAll("零零", "零");
		result = result.replaceAll("零万", "万");
		result = result.replaceAll("零零", "零");
		result = result.replaceAll("零元", "元");
		result = result.replaceAll("亿万", "亿");

		result = result.replaceAll("零$", "");
		result = result.replaceAll("元$", "元整");
		result = result.replaceAll("角$", "角整");

		return result;
	}

}
