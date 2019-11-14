package com.vtiger.generics;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.vtiger.generics.Excel;

public class BaseTest implements IAutoConstant{
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static String browser_name="";
	static int r=1,c=0;
	
	
	static {
		try {
		fis = new FileInputStream(CONFIG_PATH);
		con = new Properties();
		con.load(fis);
		Scanner sc= new Scanner(System.in);
		browser_name = sc.next();
		if(browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
		}
		else {
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public static void openApp() {
		
		if(browser_name.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterMethod
	public static void closeApp(ITestResult result)throws Throwable {
		String testCase = result.getName();
		int status=result.getStatus();
		if (status==1) {
			Reporter.log("pass",true);
			Excel.setData(testCase,"pass", r, c, SHEET_NAME, WRITE_PATH);
			r++;
			c++;
		}
		else {
			Reporter.log(testCase+"is Fail", true);
			ScreenShot.getScreenShot(driver, testCase);
			Excel.setData(testCase, "pass", r, c, SHEET_NAME, WRITE_PATH);
				r++;
				c++;
		}
		
		driver.close();
	}
}



