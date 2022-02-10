package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexSearch extends BasePage{


    public YandexSearch(WebDriver driver) {
        super(driver);
    }

    By strokaSearch = By.xpath("//span[@class='input__box']");
}
