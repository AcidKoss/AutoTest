package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static Const.Const.constTest.numberOfResultsQuery;

public class RezultPage extends BasePage {
    public RezultPage(WebDriver driver) {
        super(driver);
    }

    private final By rezultSearch = By.xpath("//li[@class='serp-item desktop-card']");

    // Подсчет количества результатов выдачи
    public RezultPage checkCauntRezult() {
        int cauntRezult = driver.findElements(rezultSearch).size();
        Assert.assertEquals(numberOfResultsQuery, cauntRezult);

        //Вернуть текущий экземпляр
        return this;
    }
}