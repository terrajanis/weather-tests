package pages.yandex;

import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class MainYandexPage extends BasePage {

    private SelenideElement searchInput = $(".mini-suggest__input");

    public void searchCity(String city) {
        searchInput.setValue(city);
        searchInput.pressEnter();
    }
}
