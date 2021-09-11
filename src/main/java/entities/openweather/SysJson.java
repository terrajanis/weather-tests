
package entities.openweather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class SysJson {

    @JsonSchema(required = true)
    private String country;

    @JsonSchema(required = true)
    private Long id;

    @JsonSchema(required = true)
    private Long sunrise;

    @JsonSchema(required = true)
    private Long sunset;

    @JsonSchema(required = true)
    private Long type;
}
