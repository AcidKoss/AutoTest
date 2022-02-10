package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Const.Const.Timeout.timeOut;
import static common.Config.PlatformAndBrowser;

// Можно добавить настройки для новых связок ОС + браузер

public class CommonAction {
    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (PlatformAndBrowser){
            case "WinChrom":
                System.setProperty("webdriver.chrome.driver","C:\\Selen\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }

        // Размер окна макс
        driver.manage().window().maximize();
        // Ожидание неявное
        driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
        return driver;
    }
}
