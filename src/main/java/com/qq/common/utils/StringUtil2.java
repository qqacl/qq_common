package com.qq.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil2 {
	
	//字符串转整数
	public static Integer strToInteger(String str) {
		return Integer.parseInt(str);
	}
	
	//字符串转日期
	public static Date strToDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @Title: split 
	 * @Description: 字符串切割
	 * @param news  字符串
	 * @param chars 切割的字符值
	 * @return
	 * @return: String[]
	 */
	public static String[] split(String news, String chars) {
		return news.split(chars);
	}
		

}
