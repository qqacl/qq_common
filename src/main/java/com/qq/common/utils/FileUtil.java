package com.qq.common.utils;

import java.io.File;

/**
 * 
 * @ClassName: FileUtil 
 * @Description: 文件工具类
 * @author:王圆圆
 * @date: 2019年8月9日 上午10:10:38
 */
public class FileUtil {
	
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		
		if (null!=fileName && fileName.length()>0 && fileName.lastIndexOf(".")>0) {
			return fileName.substring(fileName.lastIndexOf("."));
		} else {
			return "文件不合法";
		}
		
	}
	
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}

}
