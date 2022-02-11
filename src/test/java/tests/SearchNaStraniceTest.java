package tests;

import pages.YandexSearch;

public class SearchNaStraniceTest extends BaseTest{

    public void checkIsLoadingPageResult (){
        //Открываем нужную страницу
        basePage.open("https://yandex.ru/");

        //Используем методы из класса yandexSearch, можно их вызывать через точку так как там использован return this
        yandexSearch
                .inStrokaSearch()
                .clicSearch();
    }

}
