package com.crm.crm_hybridframework.logintest;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.crm.crm_hybridframework.base.ExcelReader;
import com.crm.crm_hybridframework.base.KeywordsImpl;

public class LoginTest {
	 @Test
	public void test() {
	   KeywordsImpl key = new  KeywordsImpl();
	   ArrayList data = ExcelReader.getTestData("D:\\fb\\LoginTestCase.xlsx");
	   for(int i=0;i<data.size();i++) {
		   if(data.get(i).equals("open")) {
			   key.open();
		   }
		   if(data.get(i).equals("url")) {
			   key.url(data.get(i+1).toString());
		   }
	   }
    }
}
