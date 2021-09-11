
package entities.gismeteo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class SpeedJson {

    @JsonSchema(required = true)
    @JsonProperty("km_h")
    private Long kmH;

    @JsonSchema(required = true)
    @JsonProperty("m_s")
    private Long ms;

    @JsonSchema(required = true)
    @JsonProperty("mi_h")
    private Long miH;
}
