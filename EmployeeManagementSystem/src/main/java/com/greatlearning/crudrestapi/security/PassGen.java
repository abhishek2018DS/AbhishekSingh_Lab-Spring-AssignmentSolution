package com.greatlearning.crudrestapi.security;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("abhishek"));
		System.out.println(encoder.encode("abhinav"));
		System.out.println(encoder.encode("ashwani"));
		System.out.println(encoder.encode("sushant"));
		
	}
}


