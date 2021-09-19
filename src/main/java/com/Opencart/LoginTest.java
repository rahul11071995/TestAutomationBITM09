package com.Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static WebDriver driver;

    public static void main(String[] args) {

    launch_Chorme();
    open_LoginPage();
    TC_Login_001();
    TC_Login_002();
    TC_Login_003();
    TC_Login_004();
    close_Chrome();


    }

    //step 1
    public static void launch_Chorme(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximize window

    }

    //step 2
    public static void open_LoginPage(){

    driver.get("https://demo.opencart.com/index.php?route=account/login");

    }

    //Email and pass valid
    public static void TC_Login_001(){
    /*
    step 3, 4 & 5
     */
        //step 3
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("user101@gmail.com");
        //step 4
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");
        //step 5
        WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        //Verification By Title
        String Expected_Title = "My Account";
        String Actual_Title = driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){

            System.out.println("Test Case Passed");
        }
        else{

            System.out.println("Test Case failed");
        }


        //Logout
        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();
        //again login page
        WebElement LoginPage = driver.findElement(By.linkText("Login"));
        LoginPage.click();



        System.out.println("TC_Login_001 Executed");



    }



    //Email invalid and pass valid
    public static void TC_Login_002(){
     /*
    step 3, 4 & 5
     */
        //step 3
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@test.com");
        //step 4
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");
        //step 5
        WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        //Verification By Title
        String Expected_Title = "Account Login";
        String Actual_Title = driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){

            System.out.println(" Test Case Passed");
        }
        else{

            System.out.println("Test Case failed");
        }


        System.out.println("TC_Login_002 Executed");



    }
    //Email valid and pass invalid
    public static void TC_Login_003(){
     /*
    step 3, 4 & 5
     */
        //step 3
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("user101@gmail.com");
        //step 4
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567890");
        //step 5
        WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();


        //Verification By Title
        String Expected_Title = "Account Login";
        String Actual_Title = driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){

            System.out.println("Test Case Passed");
        }
        else{

            System.out.println("Test Case failed");
        }


        System.out.println("TC_Login_003 Executed");





    }

    //Email invalid and pass invalid
    public static void TC_Login_004(){
     /*
    step 3, 4 & 5
     */
        //step 3
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@test.com");
        //step 4
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567890");
        //step 5
        WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();


        //Verification By Title
        String Expected_Title = "Account Login";
        String Actual_Title = driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){

            System.out.println("Test Case Passed");
        }
        else{

            System.out.println("Test Case failed");
        }


        System.out.println("TC_Login_004 Executed");


    }
    //step 6
    public static void close_Chrome(){

        driver.close(); // close only active tab

    }


}
