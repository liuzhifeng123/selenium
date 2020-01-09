package com.webdriver;

import com.config.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ElementLocation {
        Init init = new Init();
       public static List<WebElement> element;
       public WebElement getElement(){
           WebElement webElement = element.get(0);
           return webElement;
       }
    public void Location(String mode, String ele){

     if(mode.equals("id")){
         System.out.println(init.getDriver());
              element= init.getDriver().findElements(By.id(ele));
        }else if (mode.equals("name")){
         element= init.getDriver().findElements(By.name(ele));

        }else if (mode.equals("classname")){
         element= init.getDriver().findElements(By.className(ele));

        }else if (mode.equals("tagname")){
         element= init.getDriver().findElements(By.tagName(ele));

        }else if (mode.equals("xpath")){
         element= init.getDriver().findElements(By.xpath(ele));

        }else if (mode.equals("css")){
         element= init.getDriver().findElements(By.cssSelector(ele));

        }else if (mode.equals("text")){
         element= init.getDriver().findElements(By.linkText(ele));

        }
       }
}
