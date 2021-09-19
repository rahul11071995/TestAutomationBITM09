package com.BrowserSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSize {

    public static WebDriver driver;
    private static Dimension New;


    public static void main(String[] args) {
       launch_Chrome();
      // close_Chrome();

        setSizeTab();

        }


        public static void launch_Chrome(){

            System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
            // System.out.println("webdriver.chrome.driver","F:\\study materils\\SQA\\BITM\\Automation\\Tools");
            driver = new ChromeDriver();
            driver.manage().window().maximize(); //maximize window
        }



        public static void setSizeTab(){
        driver.manage().window().setSize(new Dimension(768,500) );

        }

    public static void close_Chrome (){

        driver.close(); // close only active tab

    }

    }





