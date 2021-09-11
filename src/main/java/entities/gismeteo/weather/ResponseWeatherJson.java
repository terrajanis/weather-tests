
package entities.gismeteo.weather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class ResponseWeatherJson {

    @JsonSchema(required = true)
    private Long city;

    @JsonSchema(required = true)
    private CloudinessJson cloudiness;

    @JsonSchema(required = true)
    private DateJson date;

    @JsonSchema(required = true)
    private DescriptionJson description;

    @JsonSchema(required = true)
    private Long gm;

    @JsonSchema(required = true)
    private HumidityJson humidity;

    @JsonSchema(required = true)
    private String icon;

    @JsonSchema(required = true)
    private String kind;

    @JsonSchema(required = true)
    private PrecipitationJson precipitation;

    @JsonSchema(required = true)
    private PressureJson pressure;

    @JsonSchema(required = true)
    private RadiationJson radiation;

    @JsonSchema(required = true)
    private Boolean storm;

    @JsonSchema(required = true)
    private TemperatureJson temperature;

    @JsonSchema(required = true)
    private WindJson wind;
}
