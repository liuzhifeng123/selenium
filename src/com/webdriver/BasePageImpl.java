package com.webdriver;
import com.config.Init;
import com.webdriver.toolAPI.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class BasePageImpl implements BasePage {

    private  WebDriver driver;
    private  ElementLocation elementLocation = new ElementLocation();

    @Override
    public void   Driver(String browser, String URL){
        if (browser.equals("Chrome")){
            driver = new ChromeDriver();
            driver.get(URL);
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


    @Override
    public WebElement findElement(String loc) {
        return driver.findElements();
    }

    @Override
    public void sendKeys(String value) {

        elementLocation.getElement().sendKeys(value);
    }

    //键盘操作
    public void sendKeys(Keys backSpace) {
    }

    @Override
    public void BrowseroPeration(String peration) {

        switch (peration) {
            case "浏览器最大化":
                System.out.println(driver);
                driver.manage().window().maximize();
                break;
//            case "设置浏览器大小":
//                driver.getDriver().manage().window().setSize(new Dimension(480, 800));
//
//                break;
//            case "后退":
//                driver.getDriver().navigate().back();
//                break;
//
//            case "前进":
//                driver.getDriver().navigate().forward();
//                break;
//            case "F5":
//                driver.getDriver().navigate().refresh();
//                break;
//            case "关闭浏览":
//                driver.getDriver().quit();
//                ;
//                break;

        }

    }

//    @Override
//    public String getTitle() {
//        System.out.println(driver.getDriver());
//        return driver.getDriver().getTitle();
//    }
//
//    @Override
//    public String getCurrentUrl() {
//
//        return driver.getDriver().getCurrentUrl();
//    }
//
//    @Override
//    public String getText() {
//
//        return elementLocation.getElement().getText();
//    }
//
//
//    @Override
//    public void clear() {
//        elementLocation.getElement().clear();
//    }
//
//
//    @Override
//    public void click() {
//
//        elementLocation.getElement().click();
//    }
//
//    @Override
//    public void submit() {
//        elementLocation.getElement().submit();
//    }
//
//    @Override
//    public void contextClick() {
//        //   action.contextClick(elementLocation.getElement()).perform();
//    }
//
//    @Override
//    public void doubleClick() {
//        //   action.doubleClick(ele).perform();
//    }
//
//    @Override
//    public void clickAndHold() {
//        System.out.println(elementLocation.getElement());
//     //   action.clickAndHold(elementLocation.getElement()).perform();
//    }
//
//    @Override
//    public void dragAndDrop(WebElement source, WebElement target) {
//        source = elementLocation.getElement();
//        target = elementLocation.getElement();
//        //   action.dragAndDrop(source,target).perform();
//    }
//
//    @Override
//    public void implicitlyWait(int time) {
//        driver.getDriver().manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
//    }
//
//    @Override
//    public void setScriptTimeout(int time) {
//        driver.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
//
//    }
//
//    @Override
//    public void pageLoadTimeout(int time) {
//        driver.getDriver().manage().timeouts().setScriptTimeout(time, TimeUnit.SECONDS);
//    }
//
//    @Override
//    public WebDriverWait WebDriverWait(int maxtime, int etctime) {
//        WebDriverWait wait = WebDriverWait(driver.getDriver(), maxtime, etctime);
//        wait.until(new ExpectedCondition<WebElement>() {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return elementLocation.getElement();
//            }
//        }).sendKeys();
//        return wait;
//    }
//
//    private WebDriverWait WebDriverWait(WebDriver diver, int maxtime, int etctime) {
//        return null;
//    }//=====================1============
//
//    @Override
//    public void frame() {
//        driver.getDriver().switchTo().frame(elementLocation.getElement());
//
//    }
//
//    @Override
//    public void defaultContent() {
//        driver.getDriver().switchTo().defaultContent();
//    }
//
//    @Override
//    public void select(String option) {
//        Select sel = new Select(elementLocation.getElement());
//        sel.selectByValue(option);
//    }
//
//    @Override
//    public void getCookie() {
//        Set<Cookie> cookies = driver.getDriver().manage().getCookies();
//        System.out.println(cookies);
//    }
//
//    @Override
//    public void deleteCookie() {
//        driver.getDriver().manage().deleteAllCookies();
//    }


}
