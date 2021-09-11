
package entities.gismeteo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

import javax.validation.constraints.Null;

@Data
public class RadiationJson {

    @Null
    @JsonSchema(required = true)
    @JsonProperty("UVB")
    private String uvb;

    @Null
    @JsonSchema(required = true)
    @JsonProperty("uvb_index")
    private String uvbIndex;
}
