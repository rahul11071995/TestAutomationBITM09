package com.BrowserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConfig {


    public static WebDriver driver;


    public static void main(String[] args) {

        launch_Chrome ();

    }
    public static void launch_Chrome (){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        // System.out.println("webdriver.chrome.driver","F:\\study materils\\SQA\\BITM\\Automation\\Tools");
        driver = new ChromeDriver();
    }

}
