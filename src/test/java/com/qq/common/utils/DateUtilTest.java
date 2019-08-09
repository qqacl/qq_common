package com.qq.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() throws ParseException {
		
		String str = "2017-12-12 12:12:12";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = DateUtil.getDateByInitMonth(sdf.parse(str));
//		Date date = DateUtil.getDateByInitMonth(new Date());//返回当前时间
		System.out.println(sdf.format(date));
		
	}
	
	@Test
	public void testGetDateByFullMonth() throws ParseException {
		
		String str = "2000-02-12 12:12:12";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = DateUtil.getDateByFullMonth(sdf.parse(str));
//		Date date = DateUtil.getDateByFullMonth(new Date());//返回当前时间
		System.err.println(sdf.format(date));
		
	}
	
	
	/**
	 * 
	 * @Title: test1 
	 * @Description: String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
			                     将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换
			                     将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。
			                     最后打印出正确拼接的SQL字符串。
	 * @return: void
	 */
	@Test
	public void test1() {
		
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date1 = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		
		String replace = sql.replace("{1}", sdf.format(date1)).replace("{2}", sdf.format(date2));
		System.out.println(replace);
		
	}
	
	

}
