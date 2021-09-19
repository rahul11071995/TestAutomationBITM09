package com.Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

    public static WebDriver driver;


    public static void main(String[] args) {


        launch_Chrome();
        open_RegistrationPage();
        TC_Registration_001();
        /*TC_Registration_002();
        TC_Registration_003();
        TC_Registration_004();
        TC_Registration_005();
        TC_Registration_006();
        TC_Registration_007();


        TC_Registration_008();
        //TC_Registration_009();

       // close_Chrome();
*/


    }
    //step 1
    public static void launch_Chrome(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximize window

    }

    //step 2
    public static void open_RegistrationPage(){

        driver.get("https://demo.opencart.com/index.php?route=account/register");


    }
    //Registration with all valid data
    public static void TC_Registration_001(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("spider");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Johnson");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test500@gmail.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01935308000");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("13599");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("13599");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();



        //Verification By Title
        String Expected_Title = "Your Account Has Been Created!";
        String Actual_Title = driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){

            System.out.println("Test Case Passed");
        }
        else{

            System.out.println("Test Case failed");
        }



    }

    //==========Registration with  invalid data================


    //Registration without first name
    public static void TC_Registration_002(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Johnson");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test04@test.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01935308669");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("13579");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("13579");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();




    }

    //Registration without last name
    public static void TC_Registration_003(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Hulk");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test04@test.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01935308669");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("13579");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("13579");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();




    }

    //Registration with invalid Email
    public static void TC_Registration_004(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Hulk");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Johnson");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test04test.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01935308669");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("13579");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("13579");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();




    }

    //Registration without Telephone
    public static void TC_Registration_005(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Hulk");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Johnson");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test04test.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("13579");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("13579");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();




    }

    //Registration with invalid password
    public static void TC_Registration_006(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Hulk");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Johnson");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test04test.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01935308669");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("13");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("13");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();




    }

    //Registration without confirm password
    public static void TC_Registration_007(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Hulk");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Johnson");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test04test.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01934306745");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("1334");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("1343");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();




    }

    //Registration without click newsletter
    public static void TC_Registration_008(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Hulk");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Johnson");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test04@test.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01943129876");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("1334");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("1334");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        //Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();




    }

    //Registration without tick on Privacy policy
    public static void TC_Registration_009(){

        //First_Name
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Hulk");

        //Last_Name
        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Johnson");

        //Email
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("test04@test.com");

        //Telephone
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01943129876");

        //Password
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("1334");

        //Confirm_Password
        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("1334");

        //Newsletter
        WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        Newsletter.click();

        //Privacy_Policy
        WebElement Privacy_Policy = driver.findElement(By.name("agree"));
        //Privacy_Policy.click();

        //ContinueBtn
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        ContinueBtn.click();




    }










    public static void close_Chrome(){

        driver.close(); // close only active tab

    }


}
