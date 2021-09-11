
package entities.gismeteo.weather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class WindJson {

    @JsonSchema(required = true)
    private DirectionJson direction;

    @JsonSchema(required = true)
    private SpeedJson speed;
}
