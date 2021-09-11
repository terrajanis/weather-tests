package pages.yandex;

import static com.codeborne.selenide.Selenide.$x;

public class SearchResultsYandexPage {

    public void chooseCity(String city) {
        $x(String.format("//a[contains(., \"%s\")]", city)).click();
    }
}
