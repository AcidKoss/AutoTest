import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Selen\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        By strokaSearch = By.xpath("//input[@class='input__control input__input mini-suggest__input']");
        By buttonSearch = By.xpath("//button[@class='button mini-suggest__button button_theme_search button_size_search i-bem button_js_inited']");
        driver.get("https://yandex.ru/");
        driver.findElement(strokaSearch).sendKeys("Java");
        driver.findElement(buttonSearch).click();




    }


}
