package com.config;

import com.webdriver.BrowserDriver;
import com.webdriver.ElementLocation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Init {
    private WebDriver driver;

    public  Init(){

    }
    public  Init(WebDriver driver){
        this.driver=driver;
    }

    public void setDriver(WebDriver driver){
        this.driver=driver;
    }

    public  WebDriver getDriver(){
        return  driver;
    }

}
