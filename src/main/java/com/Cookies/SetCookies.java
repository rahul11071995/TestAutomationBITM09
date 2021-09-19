package com.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SetCookies {

    public static WebDriver driver;


    public static void main(String[] args) {

        launch_Chrome();
         openURL();
        addCookie();
        getAllCookie();
        close_Chrome();




    }

    public static void launch_Chrome() {

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        // System.out.println("webdriver.chrome.driver","F:\\study materils\\SQA\\BITM\\Automation\\Tools");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximize window
    }

    public static void openURL() {

        driver.get("https://www.apple.com/"); //write url with web protocol



    }
    public static void addCookie(){
        Cookie cok=new Cookie("Muntasir","Test Cookie set by Automated Script");
        driver.manage().addCookie(cok);



    }


    public static void getAllCookie(){

        Set allCookies = driver.manage().getCookies();
        System.out.println(allCookies+ "/n");
        System.out.println("Number of Cookies present : "+allCookies.size());



    }
    public static void close_Chrome() {

        driver.close(); // close only active tab

    }


}
