package entities.gismeteo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class DegreeJson {

    @JsonSchema(required = true)
    @JsonProperty("C")
    private Double c;

    @JsonSchema(required = true)
    @JsonProperty("F")
    private Double f;
}
