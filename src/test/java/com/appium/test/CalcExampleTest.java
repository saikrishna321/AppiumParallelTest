package com.appium.test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.parallel.util.BaseTest;

public class CalcExampleTest extends BaseTest {
	public CalcExampleTest() {

	}

	public CalcExampleTest(int deviceNum) {
		super(deviceNum);
	}

	public void performOperations() {
		System.out.println("Inside performOperaion");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		driver.findElement(By.id("com.android2.calculator3:id/digit5")).click();
		driver.findElement(By.id("com.android2.calculator3:id/plus")).click();
		driver.findElement(By.id("com.android2.calculator3:id/digit9")).click();
		driver.findElement(By.id("com.android2.calculator3:id/equal")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String num = driver.findElement(By.xpath("//android.widget.EditText[@index=0]")).getText();
		System.out.println("Result : " + num);
		driver.findElement(By.id("com.android2.calculator3:id/digit5")).click();
		driver.findElement(By.id("com.android2.calculator3:id/plus")).click();
		driver.findElement(By.id("com.android2.calculator3:id/digit9")).click();
		driver.findElement(By.id("com.android2.calculator3:id/equal")).click();
		driver.closeApp();

	}

	public void run() {
		createDriver(); // create devices
		performOperations(); // user function
	}

	@Test
	public void testApp() {
		performOperations();
	}

}
