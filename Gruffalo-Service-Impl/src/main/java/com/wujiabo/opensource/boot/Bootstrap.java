package com.wujiabo.opensource.boot;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/application-config.xml", "spring/dubbo.xml", "spring/jpa.xml" });
		context.start();
		System.in.read();
	}

}
