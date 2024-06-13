package org;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OrgTest{
	@Test
	public void createorg() {
		String Url=System.getProperty("url","www.fb.com/");
		String brow=System.getProperty("browser","chrome");
		String UN=System.getProperty("un");
		String pwd=System.getProperty("pwd");
		
		
		System.out.println(Url+","+brow+","+UN+ ","+pwd);
		
		System.out.println("excecute create org test");
	}

	@Test
	public void createorgmod() {
		System.out.println("excecute create org test modi");
	}
	}

