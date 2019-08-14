package com.qq.common.utils;

import java.util.Date;

import org.junit.Test;

public class PatternUtilTest {

	@Test
	public void testGetDateFromUrl() {
		String str = "http://news.cnstock.com/news,yw-201905-1613224.htm";
		Date date = PatternUtil.getDateFromUrl(str);
		System.out.println(date);
	}

	@Test
	public void testGetNumberFromUrl() {
		String str = "http://news.cnstock.com/news,yw-201905-1613224.htm";
		Integer integer = PatternUtil.getNumberFromUrl(str);
		System.out.println(integer);
	}

	

}
