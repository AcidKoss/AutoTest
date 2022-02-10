package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Const.Const.Timeout.timeOutYavnoe;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    // метод открытия страниц
    public void open (String url){
        driver.get(url);
    }

    // метод явных ожиданий видимости элемента
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, timeOutYavnoe).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
