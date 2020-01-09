package com.webdriver;

import com.config.Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


public class BrowserDriver {

   private   WebDriver driver ;



    public void   setDriver(WebDriver driver,String URl){
        this.driver = driver;
        driver.get(URl);
    }

    public WebDriver getDriver() {
        return driver;
    }


    public void   Driver(String browser, String URL){
        if (browser.equals("Chrome")){
             driver = new ChromeDriver();
             driver.get(URL);
             new Init(driver);

        }else if ( browser.equals("Firefox")){
             driver = new FirefoxDriver();
            driver.get(URL);
        }else if (browser.equals("Edge")){
             driver = new EdgeDriver();
            driver.get(URL);
        }else if (browser.equals("IE")){
             driver = new InternetExplorerDriver();
            driver.get(URL);
        }else if (browser.equals("Opera")){
             driver = new OperaDriver();
            driver.get(URL);
        }else if (browser.equals("PhantomJS")){
             driver = new PhantomJSDriver();
            driver.get(URL);
        }
    }


}
