package main;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RiaTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "D://Projects//RiaTest/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://developers.ria.com/");
    }

    //Signup
    @Test
    public void userLogin() {
        WebElement loginButton = driver.findElement(By.className("btn"));
        loginButton.click();
        WebElement userFirstName = driver.findElement(By.id("user_first_name"));
        userFirstName.sendKeys("Evhen");
        WebElement userLastName = driver.findElement(By.id("user_last_name"));
        userLastName.sendKeys("Nypadymka");
        WebElement eMail = driver.findElement(By.id("user_email"));
        eMail.sendKeys("e.nypadymka@ukr.net");
        WebElement description = driver.findElement(By.id("user_use_description"));
        description.sendKeys("For testing");
        WebElement termsAndConditions = driver.findElement(By.id("user_terms_and_conditions"));
        termsAndConditions.click();
        WebElement signup = driver.findElement(By.className("btn"));
        signup.submit();

        //Write into file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("AccountID.txt"))) {
            WebElement find = driver.findElement(By.className("signup-footer"));
            bw.write(find.getText());
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}