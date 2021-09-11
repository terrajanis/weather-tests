package pages.gismeteo;

import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainGismeteoPage extends BasePage {

    private SelenideElement searchInput = $("#js-search");

    public void searchCity(String city) {
        searchInput.setValue(city);
        $x(String.format("//span[1][contains(., \"%s\")]", city)).click();
    }
}
