
package entities.openweather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class CoordJson {

    @JsonSchema(required = true)
    private Double lat;

    @JsonSchema(required = true)
    private Double lon;
}
