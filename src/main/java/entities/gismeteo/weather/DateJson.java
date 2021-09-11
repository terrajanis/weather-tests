
package entities.gismeteo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

import javax.validation.constraints.Null;

@Data
public class DateJson {

    @Null
    @JsonSchema(required = true)
    @JsonProperty("hr_to_forecast")
    private String hrToForecast;

    @JsonSchema(required = true)
    private String local;

    @JsonSchema(required = true)
    @JsonProperty("time_zone_offset")
    private Long timeZoneOffset;

    @JsonSchema(required = true)
    @JsonProperty("UTC")
    private String utc;

    @JsonSchema(required = true)
    private Long unix;
}
