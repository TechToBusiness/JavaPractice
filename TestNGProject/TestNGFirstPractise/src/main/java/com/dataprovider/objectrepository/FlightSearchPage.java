package com.dataprovider.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dataprovider.base.TestBase;

public class FlightSearchPage extends TestBase {
	
	@FindBy (xpath="//span[contains(text(),'From')]")
	public WebElement fromCityClick;
	
	@FindBy (xpath="//input [@type='text' and @placeholder='From']")
	public WebElement fromCity;
	
	@FindBy (xpath="//li [@role='option' and @id='react-autowhatever-1-section-0-item-0']")
	public WebElement firstOption;
	
	@FindBy (xpath="//span[contains(text(),'To')]")
	public WebElement toCityClick;
	
	@FindBy (xpath="//input [@type='text' and @placeholder='To']")
	public WebElement toCity;
	
//	@FindBy (xpath="//li [@role='option' and @id='react-autowhatever-1-section-0-item-0']")
//	WebElement firstOption;
	
	@FindBy (xpath="//input[@id='departure']")
	public WebElement deptDate;
	

	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	public WebElement dateCalendarNext;
	
	@FindBy (xpath="//div[contains(text(),'June')]//span[contains(text(),'2019')]")
	public WebElement monthHeading;
	
	@FindBy (xpath="//div [@class='DayPicker-Day' and @aria-label='Mon Jun 24 2019']")
	public WebElement dateSelect;
	
	
	@FindBy (xpath="//span[contains(text(),'Travellers & CLASS')]")
	public WebElement travelClass;
	
	@FindBy (xpath="//p [contains(text(),'ADULTS (12y +)')]/following-sibling::ul[1]//li [contains(text(),'3')]")
	public WebElement adultTraveller;
	
	@FindBy (xpath="//p [contains(text(),'CHILDREN (2y - 12y )')]/following-sibling::ul[1]//li [contains(text(),'3')]")
	public WebElement childTraveller;
	
	@FindBy (xpath="//button[contains(@class,'primaryBtn btnApply pushRight')]")
	public WebElement applyTravellerSelection;
	
	@FindBy (xpath="//a [contains(text(),'Search')]")
	public WebElement searchFlights;
	
	@FindBy (xpath="//div[@id='ow_domrt-jrny']//button[@id='sorter_btn']")
	public WebElement nextPageSort;
	
	@FindBy (xpath="//span[text()='Flights']")
	public WebElement flightLink;
	
	@FindBy (xpath="//label [contains(text(),'TRIP TYPE')]")
	public WebElement tripType;
}
