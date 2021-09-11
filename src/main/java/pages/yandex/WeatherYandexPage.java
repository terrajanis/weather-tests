package pages.yandex;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WeatherYandexPage {


    private SelenideElement temperature = $(".temp__value_with-unit");

    public int getTemperatureNow() {
        String fullTemperatureText = temperature.getText().replace("+", "");
        return Integer.parseInt(fullTemperatureText);
    }
}
