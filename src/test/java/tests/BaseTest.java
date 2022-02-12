package tests;

// Создаем настройку для тестов


import common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.BasePage;
import pages.RezultPage;
import pages.YandexSearchPage;

import static common.Config.clearCookies_And_Local;
import static common.Config.close_Brauser;

public class BaseTest {
    // подключить метод драйвер CommonAction - createDriver в виде объекта от класса
    protected WebDriver driver = CommonAction.createDriver();
    // наследники по страницам в виде объекта ???????????????
    protected BasePage basePage = new BasePage(driver);
    // передаем домашнюю страницу в виде объекта
    protected YandexSearchPage yandexSearch = new YandexSearchPage(driver);
    protected RezultPage yandexRezultPage = new RezultPage(driver);

    // можно добавить полезные методы которые нужны для каждого теста
    // очистка Кук и локал стораж

    // Будет запускаться после теста AfterTest
    @AfterTest
    public void clearCookiesAndLocal (){
        // по определенному условию
        if(clearCookies_And_Local){
            // прописываем джава скрипт для очистки локалстораж
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    // Выполняется после съюта alwaysRun выполняется всегда
    @AfterSuite (alwaysRun = true)
    public void closeBrauser(){
        if (close_Brauser){
            driver.quit();
        }

    }


}
