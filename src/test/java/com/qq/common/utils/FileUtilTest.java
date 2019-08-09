package com.qq.common.utils;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		
		String file = "aa.txt";
//		String file2 = "aaaa";
		
		String str = FileUtil.getExtendName(file);//输出file2就是 文件不合法
		System.out.println(str);
		
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
		
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
