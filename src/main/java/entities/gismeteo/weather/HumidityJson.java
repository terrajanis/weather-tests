
package entities.gismeteo.weather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class HumidityJson {

    @JsonSchema(required = true)
    private Long percent;
}
