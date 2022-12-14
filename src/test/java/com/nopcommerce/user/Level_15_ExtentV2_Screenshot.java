//package com.nopcommerce.user;
//
//
//import java.lang.reflect.Method;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import com.relevantcodes.extentreports.LogStatus;
//
//import commons.BaseTest;
//import commons.PageGeneratorManager;
//import pageObjects.nopCommerce.user.UserAddressPageObject;
//import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
//import pageObjects.nopCommerce.user.UserHomePageObject;
//import pageObjects.nopCommerce.user.UserLoginPageObject;
//import pageObjects.nopCommerce.user.UserMyProductReviewPageObject;
//import pageObjects.nopCommerce.user.UserRegisterPageObject;
//import pageObjects.nopCommerce.user.UserRewardPointPageObject;
//import reportConfig.ExtentTestManager;
//
//public class Level_15_ExtentV2_Screenshot extends BaseTest {
//	//Declare
//	private WebDriver driver;
//
//	private  String  firstName, lastName, validPassword, emailAddress;
//
//	//Declare + Init
//	private 	UserHomePageObject homePage ;
//	private UserRegisterPageObject registerPage;
//	private UserLoginPageObject loginPage;
//	private UserCustomerInforPageObject customerInforPage;
//	private UserAddressPageObject addressPage;
//	private UserMyProductReviewPageObject myProductReviewPage;
//	private UserRewardPointPageObject rewardPointPage;
//	
//	
//	
//
//	@Parameters("browser")
//	@BeforeClass
//	public void beforeClass(String browserName) {
//		driver = getBrowserDriver(browserName);
//		
//		// Khởi tạo homePage lên trước
//		homePage = PageGeneratorManager.getUserHomePage(driver);
//	
//		firstName ="Automation";
//		lastName ="FC";		
//		emailAddress = "afc"+ generateFakeNumber()+ "@mail.vn";
//		validPassword ="123456";	
//		
//	
//	}
//
//	@Test
//	public void User_01_Register(Method method) {
//		ExtentTestManager.startTest(method.getName(), "User_01_Register");
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 01: Navigate to 'Register' page");
//		registerPage= homePage.openRegisterPage(); // B= A.action
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 02: Enter to Firstname textbox with value is '" + firstName + "'");
//		registerPage.inputToFirstNameTextbox(firstName);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 03: Enter to Lastname textbox with value is '" + lastName + "'");
//		registerPage.inputToLastNameTextbox(lastName);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 04: Enter to Email textbox with value is '" + firstName + "'");
//		registerPage.inputToEmailTextbox(emailAddress);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 05: Enter to Password textbox with value is '" + firstName + "'");
//		registerPage.inputToPasswordTextbox(validPassword);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 06: Enter to Confirmpassword textbox with value is '" + firstName + "'");
//		registerPage.inputToConfirmPasswordTextbox(validPassword);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 07: Click to 'Register' button ");
//		registerPage.clickToRegisterButton();
//
////		Assert.assertEquals(registerPage.getRegisterSuccessMessage(),"Your registration completed");
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 08:  Verify Register success message is displayed");
//		Assert.assertEquals(registerPage.getRegisterSuccessMessage(),"Your registration completed....");
//	
//		ExtentTestManager.endTest();		
//	
//	}
//	
//
//	@Test
//	public void User_02_Login(Method method) {
//		
//		ExtentTestManager.startTest(method.getName(), "User_02_Login");
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 01: Navigate to Login Page ");
//		
//		homePage =	registerPage.clickToLogoutLink();
//		loginPage =	homePage.openLoginPage();
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 02: Enter to Email textbox with value is '" + validPassword +"' ");
//		loginPage.inputToEmailTextbox(emailAddress);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 03: Enter to Email textbox ");
//		loginPage.inputToPasswordTextbox(validPassword);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 04: Click to Login button ");
//		homePage = loginPage.clickToLoginButton();
//
//
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 05: Verify 'My Account' link is displayed ");
//		Assert.assertFalse(homePage.isMyAccountLinkDisplayed());		
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 06: Navigate to 'My Account' page ");		
//		customerInforPage = homePage.openMyAccountPage();
//		
//	
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 07: Verify 'Customer Infor' page is displayed ");
//		Assert.assertFalse(customerInforPage.isCustomerInforPageDisplayed());   
//		
//		ExtentTestManager.endTest();
//	}
//
//	@AfterClass
//	public void afterClass() {
//		driver.quit();
//
//	}
//
//
//
//
//
//}
