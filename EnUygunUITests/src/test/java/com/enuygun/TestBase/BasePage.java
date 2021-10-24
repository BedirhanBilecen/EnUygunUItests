package com.enuygun.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    WebDriver driver = null;
    WebDriverWait wait = null;
    static Actions actions =null;

    public BasePage(WebDriver driver){
        this.driver=driver;
        this.actions=new Actions(driver);
        this.wait= new WebDriverWait(driver,60);
    }

    public BasePage() {

    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }

    public boolean isVisible(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        WebElement webElement = driver.findElement(by);
        return webElement.isDisplayed();
    }

    public void waitForSeconds(By by) {
    long a =5;
        WebElement firstResult = new WebDriverWait(driver, a)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public void selectByValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    public String getAttributeValue(By by){
        return driver.findElement(by).getAttribute("value");
    }
}
