package com.unity.utilities;

import java.util.Base64;

public class EncryptionUtils {

	public static void main(String[] args) {
		String token = "username:password";
		String encodedString = new String(Base64.getEncoder().encode(token.getBytes()));
		System.out.println(encodedString);
		String decodedString = new String(Base64.getDecoder().decode(encodedString));
		System.out.println(decodedString);
	}
}
