package com.BrowserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxConfig {
    public static WebDriver driver;


    public static void main(String[] args) {
        //FirefoxConfig obj = new FirefoxConfig();//Create object
        //obj.testMethod1();
        launch_Firefox();

    }
    public static void launch_Firefox (){

        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
       // System.out.println("webdriver.gecko.driver","F:\\study materils\\SQA\\BITM\\Automation\\Tools");
        driver = new FirefoxDriver();
    }
    private void testMethod1(){

        int a = 5;
        int b = 6;
        int sum = a+b;
        System.out.println("Result: "+ sum);


    }


}
