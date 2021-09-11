
package entities.gismeteo.weather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class CloudinessJson {

    @JsonSchema(required = true)
    private Long percent;

    @JsonSchema(required = true)
    private Long type;
}
