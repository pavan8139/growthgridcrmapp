package com.crm.crm_hybridframework.base;

import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordsImpl implements Keywords {
	static ChromeDriver driver;
    public void open() {
       System.setProperty("webdriver.chrome.driver","D://new selenium jars//chromedriver.exe");
  	   driver = new ChromeDriver();
	}

	public void url(String url) {
	   driver.get(url);
	}

}
