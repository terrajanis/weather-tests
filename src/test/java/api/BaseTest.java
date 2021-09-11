package api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected Properties properties = new Properties();

    {
        try {
            properties.load(new FileInputStream("src/test/resources/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected final String GISMETEO_API_URL = properties.getProperty("gismeteoApiUrl");
    protected final String OPEN_WEATHER_API_URL = properties.getProperty("openWeatherApiUrl");
    protected final String API_KEY_OPEN_WEATHER = properties.getProperty("apiKeyOpenWeather");
    protected final String API_KEY_GISMETEO = properties.getProperty("apiKeyGismeteo");

    protected final String WEATHER_PATH = "/data/2.5/weather";
    protected final String SEARCH_CITY_PATH = "/v2/search/cities/";
    protected final String GISMETEO_WEATHER_PATH = "/v2/weather/current/";
}
