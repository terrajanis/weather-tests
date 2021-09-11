
package entities.gismeteo.weather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class TemperatureJson {

    @JsonSchema(required = true)
    private DegreeJson air;

    @JsonSchema(required = true)
    private DegreeJson comfort;

    @JsonSchema(required = true)
    private DegreeJson water;
}
