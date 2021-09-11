package ui;

import com.codeborne.selenide.Condition;
import enums.Cities;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CompareTemperatureWithoutPageObjectTest extends BaseTest {

    @Description("Compare temperatures from Gismeteo and Yandex.Weather")
    @ParameterizedTest
    @EnumSource(Cities.class)
    public void compareTemperatureTest(Cities city) {
        openMainPage(GISMETEO_URL);
        $("#js-search").setValue(city.getValue());
        $x(String.format("//span[1][contains(., \"%s\")]", city.getValue())).click();
        $x("//span[text() = \"Сейчас\"]").click();
        String fullTemperatureText = $(".nowvalue__text_l").getText().replace("+", "").replace(",", ".");
        Double fullTemperature = Double.parseDouble(fullTemperatureText);
        int gismeteoTemperature = fullTemperature.intValue();

        openMainPage(YANDEX_URL);
        $(".mini-suggest__input").setValue(city.getValue());
        $(".mini-suggest__input").pressEnter();
        $x(String.format("//a[contains(., \"%s\")]", city.getValue())).click();
        String fullTemperatureYandexText = $(".temp__value_with-unit").getText().replace("+", "");
        int yandexTemperature = Integer.parseInt(fullTemperatureYandexText);

        Assertions.assertEquals(gismeteoTemperature, yandexTemperature);
    }
}
