package main;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RiaAPI {
    private static WebDriver driver;

    @Test
    public void searchMazda() {
        System.setProperty("webdriver.chrome.driver", "D://Projects//RiaTest/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://developers.ria.com/auto/search?api_key=V3YHKltcfRbxxT19BOvaiG007nzt53w1aqngu5PW&category_id=1&body_id=3&marka_id=47&model_id=396&yers=2017&gear_id=2&race=1");
    }

    @Test
    public void searchToyota() {
        System.setProperty("webdriver.chrome.driver", "D://Projects//RiaTest/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://developers.ria.com/auto/search?api_key=V3YHKltcfRbxxT19BOvaiG007nzt53w1aqngu5PW&category_id=1&body_id=3&marka_id=79&model_id=702&yers=2017&gear_id=1&race=1");
    }

    @Test
    public void searchHonda() {
        System.setProperty("webdriver.chrome.driver", "D://Projects//RiaTest/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://developers.ria.com/auto/search?api_key=V3YHKltcfRbxxT19BOvaiG007nzt53w1aqngu5PW&category_id=1&body_id=3&marka_id=28&model_id=265&yers=2017&gear_id=1&race=1");
    }

}
