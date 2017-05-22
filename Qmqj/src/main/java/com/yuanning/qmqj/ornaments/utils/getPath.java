package com.yuanning.qmqj.ornaments.utils;

public class getPath {
	
	public static String getPath(){
		return Thread.currentThread().getContextClassLoader().getResource("").getPath();
	}
}
