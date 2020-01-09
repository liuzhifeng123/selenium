package com.webdriver.toolAPI;

import com.config.Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BasePage {
    WebElement findElement(String loc);

    void   Driver(String browser, String URL);

    void sendKeys(String value);

    void BrowseroPeration(String peration);

//    String getTitle();
//
//    String getCurrentUrl();
//
//    String getText();
//
//    void clear();
//
//    void click();
//
//    void submit();
//
//    void contextClick();//右击
//
//    void doubleClick();
//
//    void clickAndHold();//鼠标点击并控制
//
//    void dragAndDrop(WebElement ele1, WebElement ele2);//拖动
//
//    //隐式等待
//    void implicitlyWait(int time);//页面加载时间
//
//    void setScriptTimeout(int time);//定位对象时间（定位超时报错）
//
//    void pageLoadTimeout(int time);//异步脚本超时时间
//
//    //显示等待
//    WebDriverWait WebDriverWait(int maxtime, int etctime);
//
//    void frame();//多表单切换
//
//    void defaultContent();//跳出表单
//
//    void select(String option);
//
//    void getCookie();
//
//    void deleteCookie();
}
