package ui;

import enums.Cities;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.gismeteo.MainGismeteoPage;
import pages.gismeteo.WeatherGismeteoPage;
import pages.yandex.MainYandexPage;
import pages.yandex.SearchResultsYandexPage;
import pages.yandex.WeatherYandexPage;

public class CompareTemperaturePageObjectTest extends BaseTest {

    @Description("Compare temperatures from Gismeteo and Yandex.Weather")
    @ParameterizedTest
    @EnumSource(Cities.class)
    public void compareTemperatureTest(Cities city) {
        MainGismeteoPage gismeteoMainPage = new MainGismeteoPage();
        gismeteoMainPage.openMainPage(GISMETEO_URL);
        gismeteoMainPage.searchCity(city.getValue());
        int gismeteoTemperature = new WeatherGismeteoPage().getTemperatureNow();

        MainYandexPage yandexMainPage = new MainYandexPage();
        yandexMainPage.openMainPage(YANDEX_URL);
        yandexMainPage.searchCity(city.getValue());
        new SearchResultsYandexPage().chooseCity(city.getValue());
        int yandexTemperature = new WeatherYandexPage().getTemperatureNow();

        Assertions.assertEquals(gismeteoTemperature, yandexTemperature);
    }

}
