package com.Base64EncodeDecode;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64EncodeDecode {

	public static void main(String[] args) {
		//encode password
		String password = "druva1234";
		Encoder encoder = Base64.getEncoder();
		String encodePassword = encoder.encodeToString(password.getBytes());
		System.out.println(encodePassword);
		
		//decode password
		String encodepwd = "ZHJ1dmExMjM0";
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodepwd);
		String decodePassword = new String(decode);
		System.out.println(decodePassword);
		
	}
}
