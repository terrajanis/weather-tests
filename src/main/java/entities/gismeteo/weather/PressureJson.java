
package entities.gismeteo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class PressureJson {

    @JsonSchema(required = true)
    @JsonProperty("h_pa")
    private Long hPa;

    @JsonSchema(required = true)
    @JsonProperty("in_hg")
    private Double inHg;

    @JsonSchema(required = true)
    @JsonProperty("mm_hg_atm")
    private Long mmHgAtm;
}
