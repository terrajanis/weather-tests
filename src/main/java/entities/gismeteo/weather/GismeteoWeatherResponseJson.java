
package entities.gismeteo.weather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import entities.gismeteo.MetaJson;
import lombok.Data;

@Data
public class GismeteoWeatherResponseJson {

    @JsonSchema(required = true)
    private MetaJson meta;

    @JsonSchema(required = true)
    private ResponseWeatherJson response;

}
