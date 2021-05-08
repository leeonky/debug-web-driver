package com.exp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class Main {
    public static void main(String[] args) throws Exception {
        RemoteWebDriver webDriver = new RemoteWebDriver(new URL("http://web-driver.tool.net:4444"), DesiredCapabilities.chrome());
        webDriver.get("https://cn.bing.com/");
        Thread.sleep(3000);
        List<WebElement> elements = webDriver.findElements(xpath("//*[text()='国际版']"));
        System.out.println(elements.get(0).getText());
        webDriver.quit();
    }
}
