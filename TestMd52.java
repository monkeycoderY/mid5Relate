package com.ww.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


import sun.misc.BASE64Encoder;

public class TestMd52 {
	public static void main(String[] args) {
		String string="test md5 string";
		System.out.println(getMd5String(string));
	}
	public static  String getMd5String(String str){
		// 确定加密方法
		MessageDigest mid5;
		try {
			mid5 = MessageDigest.getInstance("MD5");
//			使用base64将加密后的byte数组转换成字符串
//			注：这种用法加密后的结果跟另外两种不同
			BASE64Encoder base64Encoder=new BASE64Encoder();
			return base64Encoder.encode(mid5.digest(str.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
