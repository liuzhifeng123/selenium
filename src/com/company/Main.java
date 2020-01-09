package com.company;

import com.webdriver.BasePageImpl;
import com.webdriver.BrowserDriver;
import com.webdriver.ElementLocation;
import com.webdriver.toolAPI.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        BasePage basePage = new BasePageImpl();
        ElementLocation elementLocation = new ElementLocation();
        basePage.Driver("Chrome","http://www.baidu.com");
      //  basePage.BrowseroPeration("浏览器最大化");
        elementLocation.Location("id", "kw");
//        System.out.println(basePage.getTitle());
//        basePage.sendKeys("测试");
//        basePage.submit();
//
//        Thread.sleep(2000);
//        basePage.BrowseroPeration("后退");
//
//        Thread.sleep(2000);
//        basePage.BrowseroPeration("F5");
//
//        Thread.sleep(2000);
//        basePage.BrowseroPeration("前进");
//        elementLocation.Location("text","设置");
//       basePage.click();
//     //   browserDriver.getAction().clickAndHold(elementLocation.getElement()).perform();
//     //   basePage.clickAndHold();
//        elementLocation.Location("id","kw");
//        basePage.clear();
//        Thread.sleep(2000);
     //   BrowserDriver.driver.quit();

     //   String title = driver.getTitle();
     //   System.out.printf(title);
      //  driver.close();
    /*    WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().window().maximize();
        WebElement search_text = driver.findElement(By.id("kw"));
        WebElement search_button = driver.findElement(By.id("su"));
        Actions  actions = new Actions(driver);
        actions.doubleClick(search_button).perform();

        search_text.sendKeys("Java");
        search_text.clear();
        search_text.sendKeys("Selenium");
        search_button.click();
        driver.quit();*/
       /* WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");

        WebElement search_setting = driver.findElement(By.linkText("设置"));
        Actions action = new Actions(driver);
        action.clickAndHold(search_setting).perform();
        Thread.sleep(200);
        driver.quit();*/
    }
}
