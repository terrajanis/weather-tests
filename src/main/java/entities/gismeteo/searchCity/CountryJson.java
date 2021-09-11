
package entities.gismeteo.searchCity;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

import javax.validation.constraints.Null;

@Data
public class CountryJson {

    @JsonSchema(required = true)
    private String code;

    @JsonSchema(required = true)
    private String name;

    @Null
    @JsonSchema(required = true)
    private String nameP;
}
