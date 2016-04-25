package com.amex.merchantforce.MFTesting;

import java.lang.reflect.Method;

import java.util.List;

import org.testng.*;
import org.testng.annotations.*;

import com.saucelabs.testng.SauceOnDemandTestListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.*;

@Listeners({SauceOnDemandTestListener.class})
public class ExampleTest extends BaseTestClass {

	private static final Logger logger = LogManager.getLogger();

	@Test(dataProvider="hardCodedBrowsers", retryAnalyzer=Retry.class, groups={"functional", "Sample"})
	public void Example(String browser, String version, String os, Method method) throws Exception {
		logger.info("Starting test Example");

		SauceOnDemandTestListener.verboseMode = false;

		if(System.getProperty("remoteRun").equalsIgnoreCase("true")){
			logger.info("Creating a remote WebDriver");
			createDriver(browser, version, os, method.getName(), "REPLACE WITH TAG");
		}
		else {
			logger.info("Creating a local WebDriver");
			createDriver(browser);
		}

		getWebDriver().manage().window().maximize();
		boolean bArg = false;
		String sArg = "";
		boolean isPassed = true;
		String winHandleBefore = null;
		String elementID = null;
//--------------------------------------------------------------------------------------------
		logger.info("Test Start");
		logger.info("Setup and start the test");
		getWebDriver().get("http://www.google.com");
//--------------------------------------------------------------------------------------------
		logger.info("Verify Search Box");
		logger.info("Verify that the search box is present");
		TMX_lib.waitForLoad(getWebDriver());
		TMX_lib.verifyTextFromAD("Images", "Example", "", "linkText", "Images", getWebDriver());
//--------------------------------------------------------------------------------------------
		logger.info("Test Example now ending.");
	} //end test
	//@Test(dataProvider="hardCodedBrowsers", retryAnalyzer=Retry.class, groups={"functional", "Sample"})
	public void Example2(String browser, String version, String os, Method method) throws Exception {
		logger.info("Starting test Example");

		SauceOnDemandTestListener.verboseMode = false;

		if(System.getProperty("remoteRun").equalsIgnoreCase("true")){
			logger.info("Creating a remote WebDriver");
			createDriver(browser, version, os, method.getName(), "REPLACE WITH TAG");
		}
		else {
			logger.info("Creating a local WebDriver");
			createDriver(browser);
		}

		getWebDriver().manage().window().maximize();
		boolean bArg = false;
		String sArg = "";
		boolean isPassed = true;
		String winHandleBefore = null;
		String elementID = null;
//--------------------------------------------------------------------------------------------
		logger.info("Test Start");
		logger.info("Setup and start the test");
		getWebDriver().get("http://www.google.com");
//--------------------------------------------------------------------------------------------
		logger.info("Verify Search Box");
		logger.info("Verify that the search box is present");
		TMX_lib.waitForLoad(getWebDriver());
		TMX_lib.verifyTextFromAD("Imagess", "Examples", "", "linkText", "Images", getWebDriver());
//--------------------------------------------------------------------------------------------
		logger.info("Test Example now ending.");
	} //end test
} //end class
