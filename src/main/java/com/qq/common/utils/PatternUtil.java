package com.qq.common.utils;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @ClassName: PatternUtil 
 * @Description: 正则工具类
 * @author:王圆圆
 * @date: 2019年8月10日 上午10:12:03
 */
public class PatternUtil {
	
	//根据规则获取URL中数字,并转为日期
	public static Date getDateFromUrl(String url) {
		//定义规则
		String pattern = "-(\\d+)-";
		//编译规则
		Pattern c = Pattern.compile(pattern);
		//匹配规则
		Matcher m = c.matcher(url);
		//查找匹配规则的内容
		if (m.find()) {
			return StringUtil2.strToDate(m.group(1));
		}
		return null;
	}
	
	
	// 从url获取最后的数字
	public static Integer getNumberFromUrl(String url) {
		
		String pattern = "[0-9]+(?=[^0-9]*$)";
		Pattern c = Pattern.compile(pattern);
		Matcher m = c.matcher(url);
		if (m.find()) {
			String str = m.group();
			return StringUtil2.strToInteger(str);
		}
		return null;
	}
	
	
	
	

}
