package com.qq.common.utils;

import java.util.Date;

import org.junit.Test;

public class StringUtil2Test {

	@Test
	public void testStrToInteger() {
		String urls = "http://news.cnstock.com/news,yw-201908-4413224.htm|http://news.cnstock.com/news,yw-201908-5513224.htm|http://news.cnstock.com/news,yw-201907-6613224.htm|http://news.cnstock.com/news,yw-201907-7713224.htm|http://news.cnstock.com/news,yw-201907-8813224.htm|http://news.cnstock.com/news,yw-201906-9913224.htm|http://news.cnstock.com/news,yw-201906-1013224.htm|http://news.cnstock.com/news,yw-201906-1113224.htm|http://news.cnstock.com/news,yw-201906-1213224.htm|http://news.cnstock.com/news,yw-201905-1313224.htm|http://news.cnstock.com/news,yw-201905-1413224.htm|http://news.cnstock.com/news,yw-201905-1513224.htm|http://news.cnstock.com/news,yw-201905-1613224.htm";
		String[] split = StringUtil2.split(urls, "\\|");
		for (String string : split) {
			System.out.println(string);
		}
	}

	@Test
	public void testStrToDate() {
		String str = "20190811";
		Date date = StringUtil2.strToDate(str);
		
		System.out.println(date);
	}

	@Test
	public void testSplit() {
		String str = "4413224";
		Integer integer = StringUtil2.strToInteger(str);
		System.out.println(integer);
	}

}
