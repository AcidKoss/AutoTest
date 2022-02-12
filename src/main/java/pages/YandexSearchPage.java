package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Класс с действиями для конкретной страницы

// связываем с BasePage - extends
public class YandexSearchPage extends BasePage{

// создается конструктор
    public YandexSearchPage(WebDriver driver) {

        super(driver);
    }

    private final By strokaSearch = By.xpath("//input[@class='input__control input__input mini-suggest__input']");
    private final By buttonSearch = By.xpath("//button[@class='button mini-suggest__button button_theme_search button_size_search i-bem button_js_inited']");


    //Метод для реализации логики на странице

    // Установить значение в строку поиска
    public YandexSearchPage StrokaSearch (String ZnacheniePoiska){
        driver.findElement(strokaSearch).sendKeys(ZnacheniePoiska);

        //Вернуть текущий экземпляр
        return this;
    }
    //Нажатие на кнопку поиск
    public YandexSearchPage clicSearch (){
        //Использование своего метода ожидания
        //Создаем новый элемент ВебЭлемент для кнопки и далее вызываем свой метод на явное ожидание куда передаем ВебЭлемент
        WebElement btnSearch = driver.findElement(buttonSearch);
        waitElementIsVisible(btnSearch).click();
        return this;
    }

}
