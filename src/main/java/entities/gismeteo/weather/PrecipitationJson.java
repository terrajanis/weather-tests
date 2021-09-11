
package entities.gismeteo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

import javax.validation.constraints.Null;

@Data
public class PrecipitationJson {

    @JsonSchema(required = true)
    private Long amount;

    @JsonSchema(required = true)
    private Boolean correction;

    @JsonSchema(required = true)
    private Long duration;

    @JsonSchema(required = true)
    private Long intensity;

    @JsonSchema(required = true)
    private Long type;

    @Null
    @JsonSchema(required = true)
    @JsonProperty("type_ext")
    private String mTypeExt;
}
