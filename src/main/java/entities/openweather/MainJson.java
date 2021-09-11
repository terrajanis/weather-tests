
package entities.openweather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class MainJson {

    @JsonSchema(required = true)
    @JsonProperty("feels_like")
    private Double feelsLike;

    @JsonSchema
    @JsonProperty("grnd_level")
    private Long grndLevel;

    @JsonSchema(required = true)
    private Long humidity;

    @JsonSchema(required = true)
    private Long pressure;

    @JsonSchema
    @JsonProperty("sea_level")
    private Long seaLevel;

    @JsonSchema(required = true)
    private Double temp;

    @JsonSchema(required = true)
    @JsonProperty("temp_max")
    private Double tempMax;

    @JsonSchema(required = true)
    @JsonProperty("temp_min")
    private Double tempMin;
}
