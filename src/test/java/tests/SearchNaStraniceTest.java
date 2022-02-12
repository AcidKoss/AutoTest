package tests;

import org.testng.annotations.Test;

import static Const.Const.Urls.UrlGlavnaya;

public class SearchNaStraniceTest extends BaseTest{

    @Test
    public void checkIsLoadingPageResult (){
        //Открываем нужную страницу
        basePage.open(UrlGlavnaya);

        //Используем методы из класса yandexSearch, можно их вызывать через точку так как там использован return this
        yandexSearch
                .StrokaSearch("Java")
                .clicSearch();
        yandexRezultPage
                .checkCauntRezult();

    }

}
