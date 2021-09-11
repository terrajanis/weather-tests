
package entities.openweather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

import java.util.List;

@Data
public class OpenWeatherResponseJson {

    @JsonSchema(required = true)
    private String base;

    @JsonSchema(required = true)
    private CloudsJson clouds;

    @JsonSchema(required = true)
    private Long cod;

    @JsonSchema(required = true)
    private CoordJson coord;

    @JsonSchema(required = true)
    private Long dt;

    @JsonSchema(required = true)
    private Long id;

    @JsonSchema(required = true)
    private MainJson main;

    @JsonSchema(required = true)
    private String name;

    @JsonSchema(required = true)
    private SysJson sys;

    @JsonSchema(required = true)
    private Long timezone;

    @JsonSchema(required = true)
    private Long visibility;

    @JsonSchema(required = true)
    private List<WeatherJson> weather;

    @JsonSchema(required = true)
    private WindJson wind;
}
