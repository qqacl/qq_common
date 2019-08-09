package com.qq.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
	}

	@Test
	public void testReadTextFileInputStream() throws IOException {
		
		FileInputStream fis = new FileInputStream("d:/test.txt");
		String str = StreamUtil.readTextFile(fis);
		System.out.println(str);
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		
		String string = StreamUtil.readTextFile(new File("d:/test.txt"));
		System.out.println(string);
	}

}
