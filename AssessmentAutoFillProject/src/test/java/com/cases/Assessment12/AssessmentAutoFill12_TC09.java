package com.cases.Assessment12;

import com.actions.Actions;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base;
import com.codoid.products.exception.FilloException;
import com.listeners.Listeners;
import com.pageObjects.AssessmentAutoFill10Page;
import com.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class AssessmentAutoFill12_TC09 extends Base {

    public WebDriver driver;
    public Actions actions;

    private Logger log = LogManager.getLogger(AssessmentAutoFill12_TC09.class.getName());
    private HashMap<String, String> data;
    private ExtentTest logs;


    @BeforeTest
    public void initialize() throws IOException, FilloException {

        driver = initializeDriver();
        log.info("Driver is initialized.");
        data = new Utils().getTestData("TC09");
        actions = new Actions(driver);

    }

    @Test
    public void AssessmentAutoFill_12_TC9() throws InterruptedException, FilloException, IOException {


        AssessmentAutoFill10Page lp = new AssessmentAutoFill10Page(driver);
        String begin = lp.xpathBegin;
        String end = lp.xpathEnd;
        String genBegin = lp.genBeginXpath;
        String genEnd =  lp.genEndXpath;

		logs = Listeners.childNode.createNode("Form Filling for Student Started");
		logs.log(Status.INFO, "Student name is : " + data.get("Student Name"));

        actions.navigateTo(prop.getProperty("url12"));

        // Click on next button
        actions.click(lp.getNextButton());
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        actions.enterText(lp.getStudentName(), data.get("Student Name"));
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(1000);

        //logs.log(Status.INFO, "Father's name is : " + data.get("FathersName"));
        actions.enterText(lp.getFathersName(), data.get("Fathers Name"));
        Thread.sleep(1000);

        Thread.sleep(1000);
        actions.click(lp.getClassDropdown());
        Thread.sleep(1000);

        actions.click(lp.getClassName());
        Thread.sleep(1000);

        actions.click(lp.getNextButton());
        Thread.sleep(3000);

        actions.click(lp.getDistrictDropdown());
        Thread.sleep(1000);
        actions.click(lp.getBhagalpur());
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);

        actions.click(lp.getNextButton());
        Thread.sleep(3000);

        actions.click(lp.getUDISECodeDropdown());
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[24]/span"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(2000);
        actions.click(lp.getUDISECode());
        Thread.sleep(1000);
        actions.click(lp.getNextButton());
        Thread.sleep(3000);

        driver.findElement(By.xpath(begin+data.get("answer1")+end)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(begin+data.get("answer2")+end)).click();
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(1000);
        driver.findElement(By.xpath(begin+data.get("answer3")+end)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(begin+data.get("answer4")+end)).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(By.xpath(begin+data.get("answer5")+end)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(begin+data.get("answer6")+end)).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.xpath(begin+data.get("answer7")+end)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(begin+data.get("answer8")+end)).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath(begin+data.get("answer9")+end)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(begin+data.get("answer10")+end)).click();
        Thread.sleep(1000);

        //Submitting the Assessment
        actions.click(lp.getSubmitButton());
        Thread.sleep(1000);

    }

    @AfterTest
    public void teardown() {
        driver.close();
        log.info("Driver is closed");
    }
}
