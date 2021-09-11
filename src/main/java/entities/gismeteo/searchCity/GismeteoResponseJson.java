
package entities.gismeteo.searchCity;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import entities.gismeteo.MetaJson;
import lombok.Data;

@Data
public class GismeteoResponseJson {

    @JsonSchema(required = true)
    private MetaJson meta;

    @JsonSchema(required = true)
    private ResponseSearchJson response;
}
