package com.kuaishoudan.financer.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kuaishoudan.financer.bean.KSDCase;
import com.kuaishoudan.financer.bean.ShopBeanCase;
import com.kuaishoudan.financer.dao.UserDaoImpl;
import com.kuaishoudan.financer.selenium.AppSPUtil;
import com.kuaishoudan.financer.selenium.AppShopUtil;
import com.kuaishoudan.financer.selenium.AppUtil;
import com.kuaishoudan.financer.selenium.WebSPUtil;
import com.kuaishoudan.financer.selenium.WebUtil;
import com.kuaishoudan.financer.selenium.ZcjjUtil;
import com.kuaishoudan.financer.util.CaseUtil;
import com.kuaishoudan.financer.util.RandomValue;

/**
 * 不出合同
 * 
 * @author Administrator
 * 
 */
public class Test9 {

	public AppiumDriver<AndroidElement> driver = null;
	String devicename = "";
	public WebDriver webdriver = null;
	KSDCase ksd = null;

	@BeforeTest
	public void setUp() throws Exception {
		driver = AppUtil.getdriver();

		Process process = Runtime.getRuntime().exec("adb devices");
		process.waitFor();
		InputStreamReader isr = new InputStreamReader(process.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		br.readLine();
		devicename = br.readLine().replaceAll("device", "").trim();
		System.out.println(devicename);
		Thread.sleep(3000);
		// webdriver = WebUtil.getdriver();
		ksd = RandomValue.getRandom(driver);
		System.out.println("名称" + ksd.getUsername() + "手机" + ksd.getPhone()
				+ "身份证号" + ksd.getIdentitynum() + "身份类型"
				+ ksd.getIdentitytype() + "军官" + ksd.getJgid() + "企业个人"
				+ ksd.getQygr() + "车类型" + ksd.getCartype() + "车品牌"
				+ ksd.getCarbrand() + "车系" + ksd.getCarseries() + "车价格"
				+ ksd.getCarprice() + "贷款价格" + ksd.getSqdk() + "融资期限"
				+ ksd.getHkqs() + "\n  " + ksd.getPurchase_tax() + "\n "
				+ ksd.getInsurance() + " \n" + ksd.getGps_charge() + "\n "
				+ ksd.getService_charge() + "," + ksd.getRegisttype() + ","
				+ ksd.getPledge() + "车架号" + ksd.getVin());
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
		// webdriver.quit();
	}

	// 商户
	@Test(priority = 2, invocationCount = 1, threadPoolSize = 1)
	public void test2() throws Exception {

		ShopBeanCase shopBeanCase = RandomValue.getShop();
		shopBeanCase = AppShopUtil.createShop(driver, shopBeanCase, devicename);

	}

}
