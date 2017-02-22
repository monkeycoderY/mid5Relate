package com.ww.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestMd53 {
	//此处两个数据是查看源码实现时转换数组，根据源码参数默认是取的是DIGITS_LOWER，具体大写代表什么，不明确==
	private static final char[] DIGITS_LOWER =
        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
	private static final char[] DIGITS_UPPER =
        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	
	public static void main(String[] args) {
		String string="test md5 string";
		try {
			System.out.println(getMd5String(string));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getMd5String(String plainText) throws NoSuchAlgorithmException {  
		MessageDigest md = MessageDigest.getInstance("MD5");  
		md.update(plainText.getBytes());  
		byte b[] = md.digest();  
		char []charset=new char[b.length<<1];
		for(int i=0,j=0;i<b.length;i++){
			charset[j++]=DIGITS_LOWER[(0xF0&b[i])>>>4];
			charset[j++] = DIGITS_LOWER[0x0F & b[i]];
		}
		return new String(charset);	
	}
}