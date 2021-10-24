package com.enuygun.TestBase;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class BaseDriver {
    protected static WebDriver driver;
    public BaseDriver() {
    }

    @BeforeScenario
    public void setUp() {


        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get("https://www.google.com/");

    }

    @AfterScenario
    public void tearDown() {
        driver.quit();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }


}
