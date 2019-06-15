package com.easyDiner.stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.easyDiner.pages.BookingPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDefinitions extends BookingPageObject {
	
	public UserStepDefinitions(WebDriver driver) {
		super(driver);
		
	}

	protected WebDriver driver;
	
	@Given("^I navigate to easydiner$")
	public void i_navigate_to_easydiner() throws Throwable {
	    
	    System.setProperty("webdriver.chrome.driver", "E:\\TestAutomation\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.easydiner.com/");
	}

	@Given("^Select a city$")
	public void select_a_city() throws Throwable {
		selectCity.click();
	    //50% OFF
		discount.click();
		bookATable.click();
	}

	@Given("^Select date and time$")
	public void select_date_and_time() throws Throwable {
		Select dropDownGuest = new Select(selectGuest);
		dropDownGuest.selectByIndex(3);
		
		Select dropDownTime = new Select(selectTime);
		dropDownTime.selectByValue("lunch");
		
		selectTimeSlot.click();
		
		
	    
	}

	@When("^I click on book now$")
	public void i_click_on_book_now() throws Throwable {
	    
	}

	@Then("^It should navigate to payment page$")
	public void it_should_navigate_to_payment_page() throws Throwable {
	    
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    
	}

}
