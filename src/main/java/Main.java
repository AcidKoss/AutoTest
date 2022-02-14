//        (CTRL+ /) — Комментирование строки с помощью //.
//        (CTRL + SHIFT + /) — Комментирование выделенного блока кода с помощью /**/
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\Selen\\drivers\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//
//        By strokaSearch = By.xpath("//input[@class='input__control input__input mini-suggest__input']");
//        By buttonSearch = By.xpath("//button[@class='button mini-suggest__button button_theme_search button_size_search i-bem button_js_inited']");
//        driver.get("https://yandex.ru/");
//        driver.findElement(strokaSearch).sendKeys("Java");
//        driver.findElement(buttonSearch).click();
//        System.out.println();


        Item Perviy = new Item (10, 20, "Первый");
        Item Vtoroy = new Item (9, 20, "Второй");


        Boolean a = Item.sravnenie(Perviy , Vtoroy);
        System.out.println(a);


    }

    public static class Item {
        int weight;
        int cost;
        String name;
        public Item(int weight, int cost, String name) {
            this.weight = weight;
            this.cost = cost;
            this.name = name;
        }

        public static Boolean sravnenie (Item a, Item b){
            if (a.cost == b.cost & a.weight ==b.weight) {
                return true;
            }
                else
                    return false;
            }

        }

    }



