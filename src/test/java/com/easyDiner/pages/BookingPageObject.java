package com.easyDiner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingPageObject {

	public BookingPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Select a city
	@FindBy(xpath = "//div/ul/li[1]/div/a[1]")
	public WebElement selectCity;

	// Buffet
	@FindBy(xpath = "//section[1]/div/div/div[2]/div/div/a/div/span[1]")
	public WebElement buffet;

	// 50% off link
	@FindBy(xpath = "//section[1]/div/div/div[1]/div/div/a/div/span[1]")
	public WebElement discount;

	// First hotel in the list
	@FindBy(xpath = "//div[1]/div/div[3]/div[2]/div/a")
	public WebElement bookATable;

	// Select guest
	@FindBy(xpath = "//div[2]/div[1]/div/div/select")
	public WebElement selectGuest;
	public void guest_select(){
		Select dropDownGuest = new Select(selectGuest);
		dropDownGuest.selectByIndex(3);
	}

	// Select time
	@FindBy(xpath = "//div[2]/div[2]/div/div/select")
	public WebElement selectTime;
	public void time_select(){
		Select dropDownTime = new Select(selectTime);
		dropDownTime.selectByValue("lunch");
	}

	// Select date
	@FindBy(xpath = "//*[@id='form-search-slots']/div[3]")
	public WebElement selectDate;
	
	// Select Time slot
	@FindBy(xpath = "//div[1]/div/div/div/div/div[1]/label[2]/div")
	public WebElement selectTimeSlot;
	public void date_select(){
		selectTimeSlot.click();
	}

	// Select deal
	@FindBy(id = "deeyJpdiI6InJWaE0zXC82azdBTlwvT0I5RDl5cHdxdz09IiwidmFsdWUiOiJHOFZHWnVSUE9jK0dXSVVJN3l3SE1nPT0iLCJtYWMiOiI5ZTRmNzBmOTI4NWE4ZWM3NTU0MWVmNDE5MThlMDQ2NDQ0MDhkMTg3YmQ2NmMxNjQ5NmI0NDI1NWFkNWQ5NTQ3In0=1560598398121")
	public WebElement selectDeals;

	// Continue booking button
	@FindBy(className = "mt-15")
	public WebElement continueButton;

	// public WebElement btnHome = By.name("Home");

	// public WebElement lblHome = By.name("Hello world");

}
