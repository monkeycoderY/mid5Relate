package com.ww.service;

import org.apache.commons.codec.digest.DigestUtils;

public class TestMd51 {
	public static void main(String[] args) {
		String string="test md5 string";
		System.out.println(getMd5String(string));
	}
	public static  String getMd5String(String str){
		return DigestUtils.md5Hex(str);
	}
}
