package com.pageObjects;

import com.utils.Utils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssessmentAutoFill10Page {
	
	public WebDriver driver;
	
	public AssessmentAutoFill10Page(WebDriver driver) {
		this.driver = driver;
	}


	// All objects should be defined here
	private By NextButton = By.xpath("//span[text()='Next']");
	private By districtDropdown = By.xpath("//span[text()='Choose']");
	private By bhagalpur = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[7]/span");
	private By udiseCodeDropdown = By.xpath("//span[text()='Choose']");
	private By UDISECode = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[24]/span");
	private By schoolName = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input");
	private By studentName = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input");
	private By fathersName = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input");
	private By classDropdown = By.xpath("//span[text()='Choose']");
	private By selectClass = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[2]/div[3]/span");
	private By rollNo = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[9]/div/div/div[2]/div/div[1]/div/div[1]/input");
	private By submitButton = By.xpath("//span[text()='Submit']");
	private By viewScore = By.xpath("//span[text()='View score']");
	// All methods should be defined here
	public WebElement getNextButton(){ return driver.findElement(NextButton);}
	public WebElement getDistrictDropdown(){ return driver.findElement(districtDropdown);}
	public WebElement getBhagalpur(){ return driver.findElement(bhagalpur);}
	public WebElement getUDISECodeDropdown(){return driver.findElement(udiseCodeDropdown);}
	public WebElement getUDISECode(){ return driver.findElement(UDISECode);}
	public WebElement getSchoolName(){ return driver.findElement(schoolName);}
	public WebElement getStudentName(){ return driver.findElement(studentName);}
	public WebElement getFathersName(){ return driver.findElement(fathersName);}
	public WebElement getClassDropdown() { return driver.findElement(classDropdown);}
	public WebElement getClassName(){ return driver.findElement(selectClass);}
	public WebElement getRollNo(){ return driver.findElement(rollNo);}
	public WebElement getSubmitButton(){ return driver.findElement(submitButton);}
	public WebElement getScore(){ return driver.findElement(viewScore);}

	//////////// Answer Xpath Begin and End ///////////////////////////
	public String xpathBegin = "//span[text()='";
	public String xpathEnd = "']";
///////////////////////////////////////////////////////////////////

	/////////// Gender Xpath Begin and End ///////////////////////////
	public String genBeginXpath = "//span[text()='";
	public String genEndXpath = "']/../../../div/div";

//// Example :   "Male"
//////////////////////////////////////////////////////////////////


}
