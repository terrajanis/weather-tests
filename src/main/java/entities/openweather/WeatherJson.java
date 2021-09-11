
package entities.openweather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class WeatherJson {

    @JsonSchema(required = true)
    private String description;

    @JsonSchema(required = true)
    private String icon;

    @JsonSchema(required = true)
    private Long id;

    @JsonSchema(required = true)
    private String main;
}
