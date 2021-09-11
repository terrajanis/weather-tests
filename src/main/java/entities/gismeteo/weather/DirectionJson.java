
package entities.gismeteo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class DirectionJson {

    @JsonSchema(required = true)
    private Long degree;

    @JsonSchema(required = true)
    @JsonProperty("scale_8")
    private Long scale8;

}
