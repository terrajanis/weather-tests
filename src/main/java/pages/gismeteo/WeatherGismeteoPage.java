package pages.gismeteo;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WeatherGismeteoPage {

    private SelenideElement
    nowLink = $x("//span[text() = \"Сейчас\"]"),
    temperature = $(".nowvalue__text_l");

    public int getTemperatureNow() {
        nowLink.click();
        String fullTemperatureText = temperature.getText().replace("+", "").replace(",", ".");
        Double fullTemperature = Double.parseDouble(fullTemperatureText);
        return fullTemperature.intValue();
    }
}
