package com.BrowserSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBrowserSize {

    public static WebDriver driver;
    private static Dimension New;


    public static void main(String[] args) {
       launch_Chrome();
      // close_Chrome();
        getMaxSize();
        setSizeTab();

        }


        public static void launch_Chrome(){

            System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
            // System.out.println("webdriver.chrome.driver","F:\\study materils\\SQA\\BITM\\Automation\\Tools");
            driver = new ChromeDriver();
            driver.manage().window().maximize(); //maximize window
        }

        public static void getMaxSize(){


        Dimension maxsize = driver.manage().window().getSize(); //(1552, 840)
            System.out.println(maxsize);
            //option 1
              int Width = driver.manage().window().getSize().getWidth();
              int Height = driver.manage().window().getSize().getHeight();
           //option 2
           // int Width = maxsize.getWidth();
            //int Height = maxsize.getHeight();


            System.out.println("Width:" +Width+" Height: "+  Height);


        }

        public static void setSizeTab(){
        driver.manage().window().setSize(new Dimension(768,500) );

        }

    public static void close_Chrome (){

        driver.close(); // close only active tab

    }

    }





