package api;

import entities.gismeteo.searchCity.GismeteoResponseJson;
import entities.gismeteo.weather.GismeteoWeatherResponseJson;
import entities.openweather.OpenWeatherResponseJson;
import enums.Cities;
import helpers.ApiHelper;
import helpers.AssertHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CompareWeatherTest extends BaseTest {

    @Description ("Compare temperatures from Gismeteo and OpenWeather in Celsius")
    @ParameterizedTest
    @EnumSource(Cities.class)
    public void compareWeather(Cities city) {
        int openWeatherTemperature = getTemperatureFromOpenWeather(city);
        int gismeteoTemperature = getTemperatureFromGismeteo(city);
        Assertions.assertEquals(openWeatherTemperature, gismeteoTemperature);
    }

    @Step("Get a temperature (C) from Gismeteo")
    private int getTemperatureFromGismeteo(Cities city) {
        Map<String, Object> paramsGismeteo = Collections.singletonMap("query", city.getValue());
        Map<String, String> headers = Collections.singletonMap("X-Gismeteo-Token", API_KEY_GISMETEO);
        Long cityId = getCityId(paramsGismeteo, headers);

        Response responseGismeteoWeather = ApiHelper.getWithHeaders(GISMETEO_API_URL + GISMETEO_WEATHER_PATH + cityId, headers);
        AssertHelper.checkStatusCode(responseGismeteoWeather, HttpStatus.SC_OK);
        AssertHelper.checkResponseJsonSchema(responseGismeteoWeather, GismeteoWeatherResponseJson.class);
        GismeteoWeatherResponseJson gismeteoWeatherResponseJson = responseGismeteoWeather.as(GismeteoWeatherResponseJson.class);
        Double temperature = gismeteoWeatherResponseJson.getResponse().getTemperature().getAir().getC();
        return temperature.intValue();
    }

    @Step("Get a city id via API")
    private Long getCityId(Map<String, Object> paramsGismeteo, Map<String, String> headers) {
        Response responseGismeteo = ApiHelper.get(GISMETEO_API_URL + SEARCH_CITY_PATH, headers, paramsGismeteo);
        AssertHelper.checkStatusCode(responseGismeteo, HttpStatus.SC_OK);
        AssertHelper.checkResponseJsonSchema(responseGismeteo, GismeteoResponseJson.class);
        GismeteoResponseJson gismeteoResponseJson = responseGismeteo.as(GismeteoResponseJson.class);
        return gismeteoResponseJson.getResponse().getItems().get(0).getId();
    }

    @Step("Get a temperature (C) from OpenWeather")
    private int getTemperatureFromOpenWeather(Cities city) {
        Map<String, Object> paramsOpenWeather = new HashMap<>();
        paramsOpenWeather.put("q", city.getValue());
        paramsOpenWeather.put("appid", API_KEY_OPEN_WEATHER);
        Response responseOpenWeather = ApiHelper.get(OPEN_WEATHER_API_URL + WEATHER_PATH, paramsOpenWeather);
        AssertHelper.checkStatusCode(responseOpenWeather, HttpStatus.SC_OK);
        AssertHelper.checkResponseJsonSchema(responseOpenWeather, OpenWeatherResponseJson.class);
        OpenWeatherResponseJson openWeatherResponseJson = responseOpenWeather.as(OpenWeatherResponseJson.class);
        Double temperature = openWeatherResponseJson.getMain().getTemp() - 273.15;
        return temperature.intValue();
    }
}
