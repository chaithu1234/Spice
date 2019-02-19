package com.spicejet.guidelines;

import org.openqa.selenium.WebDriver;

public class Data {
	private static ThreadLocal<Data> d= new ThreadLocal<>();
	public static void set(Data data) {
		
	}
	public static Data get() {
		return d.get();
	}

	public static class Common {

		public static WebDriver driver;
		
	}

}
