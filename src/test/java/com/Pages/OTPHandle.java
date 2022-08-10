package com.Pages;

import java.util.stream.StreamSupport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.call.Stream;

import net.bytebuddy.asm.Advice.Enter;

public class OTPHandle {
	
	public static WebDriver driver ;
	
	public OTPHandle(WebDriver driver) {
		this.driver=driver;
	}
	
	 public static final String ACCOUNT_SID = System.getenv("AC5611c15ed9db83a350a3aea01b6fbb01");
	 public static final String AUTH_TOKEN = System.getenv("74dfef12ad308d2cfeb60b131608e79f");
	
	@FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")
	WebElement SignIn;
	
	
	@FindBy(id = "ap_email")
	WebElement PhoneNumber;
	
	
	@FindBy(id = "continue")
	WebElement Continue;
	
	
	@FindBy(xpath = "//span[contains(text(),'Get an OTP on your phone')]")
	WebElement OTPCallButton;
	
	@FindBy(xpath = "//*[@id='cvf-input-code']")
	WebElement EnterOTP;
	
	
	public void Login() throws Throwable {
		SignIn.click();
		
		PhoneNumber.sendKeys("9915177743"); // This is a trail dummy number - which i got from twilio.com
		
		Continue.click();
		
		Continue.click();
		
		GetOTPMessage();
		
		EnterOTP.sendKeys("111111");
	}
	
	
	public void GetOTPMessage() throws Throwable {
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		//String smsBody = getMessage();
	//	System.out.println(smsBody);
		//String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
		//System.out.println(OTPNumber);
		 
	    }
	
	
	//Get the OTP (These Methods are from Twilio.com)
	
	/*
	 * public static String getMessage() throws Throwable { return
	 * getMessages().filter(m ->
	 * m.getDirection().compareTo(Message.Direction.INBOUND) == 0) .filter(m ->
	 * m.getTo().equals("+19035322432")).map(Message::getBody).findFirst()
	 * .orElseThrow(IllegalStateException::new); }
	 */

	private  static java.util.stream.Stream<Message> getMessages() {
		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}
		
}

