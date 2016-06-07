package com.wujiabo.opensource.boot;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/*.xml" });
		context.start();
		System.in.read();
	}

}
