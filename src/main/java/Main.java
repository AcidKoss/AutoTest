//        (CTRL+ /) — Комментирование строки с помощью //.
//        (CTRL + SHIFT + /) — Комментирование выделенного блока кода с помощью /**/
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Main  {
    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver","C:\\Selen\\drivers\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//
//        By strokaSearch = By.xpath("//input[@class='input__control input__input mini-suggest__input']");
//        By buttonSearch = By.xpath("//button[@class='button mini-suggest__button button_theme_search button_size_search i-bem button_js_inited']");
//        driver.get("https://yandex.ru/");
//        driver.findElement(strokaSearch).sendKeys("Java");
//        driver.findElement(buttonSearch).click();
//        System.out.println();

        int height = 10;
        int width = 10;
        Double line = (double)(height / 2);
        long line1 = Math.round(line);
        int maxRandom = 100000;


        int [] [] arr = new int[height][width];
        Random num = new Random();

        for (int i = 0;i < arr.length; i++){
            for (int j = 0;j < arr[i].length; j++){
                arr[i][j] = num.nextInt(maxRandom);
            }
        }
        for (int i = 0;i < arr.length; i++){
            System.out.println();
            for (int j = 0;j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
        }
        int requiredIndex = width - 1;
        int comparisonValues = maxRandom;
        int smallest = maxRandom;

        for (int i = 0;i < arr.length; i++){

            for (int j = 0;j < arr[i].length; j++){
                if (j == requiredIndex){
                    comparisonValues = arr[i][j];
                }
                if (height%2 > 0 & i == line1){
                    break;
                }

                else if (comparisonValues < smallest){
                    smallest = comparisonValues;
                }
            }
            requiredIndex--;
        }
        System.out.println();
        System.out.println(smallest);









    }


}
