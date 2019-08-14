package com.qq.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testGetPlaceholderValue() {
		//测试方法一
//		String src="http://news.cnstock.com/news,yw-201908-4413224.htm";
//		String value = StringUtil.getPlaceholderValue(src, "");
//		System.out.println(value);
		
		//测试方法二
		String src="http://news.cnstock.com/news,yw-201908-4413224.htm";
		String value = StringUtil.getPlaceholderValue(src, "[0-9]+(?=[^0-9]*$)");
		System.out.println(value);
	}
	
	@Test
	public void testIsNumber() {
		String str = "123";
		boolean b = StringUtil.isNumber(str);
		System.out.println(b);
	}
	
	@Test
	public void testHasLength() {
	}

	@Test
	public void testHasText() {
		String src = "";
		boolean b = StringUtil.hasText(src);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		
		System.out.println(StringUtil.randomChineseString(10));
		System.out.println(StringUtil.randomChineseString(10));
		
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}

}
